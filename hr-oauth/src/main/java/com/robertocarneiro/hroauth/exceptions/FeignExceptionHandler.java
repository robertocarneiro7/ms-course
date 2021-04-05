package com.robertocarneiro.hroauth.exceptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.time.ZonedDateTime;

import static java.util.Objects.nonNull;

@RestControllerAdvice
@RequiredArgsConstructor
public class FeignExceptionHandler {

    private final ObjectMapper objectMapper;

    @ExceptionHandler(FeignException.class)
    public ResponseExceptionBody handleFeignStatusException(
            FeignException exception, HttpServletResponse response) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if (nonNull(HttpStatus.resolve(exception.status()))) {
            status = HttpStatus.valueOf(exception.status());
        }
        response.setStatus(status.value());
        try {
            return objectMapper.readValue(exception.contentUTF8(), ResponseExceptionBody.class);
        } catch (Exception e) {
            return ResponseExceptionBody
                    .builder()
                    .timestamp(ZonedDateTime.now())
                    .status(status.value())
                    .error(status.toString())
                    .message(e.getMessage())
                    .build();
        }
    }
}
