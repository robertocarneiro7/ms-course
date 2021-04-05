package com.robertocarneiro.hroauth.feignclients;

import com.robertocarneiro.hroauth.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

    @GetMapping("/search")
    User findByEmail(@RequestParam String email);
}
