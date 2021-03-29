package com.robertocarneiro.hrworker.services;

import com.robertocarneiro.hrworker.entities.Worker;

import java.util.List;

public interface WorkerService {

    List<Worker> findAll();

    Worker findById(Long id);
}
