package com.robertocarneiro.hroauth.services.impl;

import com.robertocarneiro.hroauth.entities.User;
import com.robertocarneiro.hroauth.feignclients.UserFeignClient;
import com.robertocarneiro.hroauth.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserFeignClient userFeignClient;

    @Override
    public User findByEmail(String email) {
        return userFeignClient.findByEmail(email);
    }
}
