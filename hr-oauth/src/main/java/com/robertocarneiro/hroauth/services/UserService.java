package com.robertocarneiro.hroauth.services;

import com.robertocarneiro.hroauth.entities.User;

public interface UserService {

    User findByEmail(String email);
}
