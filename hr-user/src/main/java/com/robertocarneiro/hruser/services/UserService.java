package com.robertocarneiro.hruser.services;

import com.robertocarneiro.hruser.entities.User;

public interface UserService {

    User findById(Long id);

    User findByEmail(String email);
}
