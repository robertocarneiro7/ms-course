package com.robertocarneiro.hruser.services.impl;

import com.robertocarneiro.hruser.entities.User;
import com.robertocarneiro.hruser.repositories.UserRepository;
import com.robertocarneiro.hruser.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Id não encontrado"));
    }

    @Override
    public User findByEmail(String email) {
        return repository
                .findByEmail(email)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Usuário com email '" + email + "' não foi encontrado"));
    }
}
