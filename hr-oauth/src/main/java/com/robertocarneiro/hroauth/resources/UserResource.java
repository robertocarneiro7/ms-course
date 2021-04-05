package com.robertocarneiro.hroauth.resources;

import com.robertocarneiro.hroauth.entities.User;
import com.robertocarneiro.hroauth.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserResource {

    private final UserService service;

    @GetMapping("/search")
    public User findByEmail(@RequestParam String email) {
        return service.findByEmail(email);
    }
}
