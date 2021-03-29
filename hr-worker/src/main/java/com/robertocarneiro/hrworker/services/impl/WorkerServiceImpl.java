package com.robertocarneiro.hrworker.services.impl;

import com.robertocarneiro.hrworker.entities.Worker;
import com.robertocarneiro.hrworker.repositories.WorkerRepository;
import com.robertocarneiro.hrworker.services.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {

    private final WorkerRepository repository;

    @Override
    public List<Worker> findAll() {
        return repository.findAll();
    }

    @Override
    public Worker findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Id não encontrado"));
    }
}
