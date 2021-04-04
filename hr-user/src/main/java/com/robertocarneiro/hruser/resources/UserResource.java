package com.robertocarneiro.hruser.resources;

import com.robertocarneiro.hruser.entities.User;
import com.robertocarneiro.hruser.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserResource {

    private final UserService service;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/search")
    public User findByEmail(@RequestParam String email) {
        return service.findByEmail(email);
    }
}
