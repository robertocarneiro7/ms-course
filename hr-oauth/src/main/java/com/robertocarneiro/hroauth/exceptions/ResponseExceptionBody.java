package com.robertocarneiro.hroauth.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ResponseExceptionBody {

    private ZonedDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
}
