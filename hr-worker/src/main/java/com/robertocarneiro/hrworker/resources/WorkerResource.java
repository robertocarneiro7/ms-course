package com.robertocarneiro.hrworker.resources;

import com.robertocarneiro.hrworker.entities.Worker;
import com.robertocarneiro.hrworker.services.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
@RequiredArgsConstructor
public class WorkerResource {

    private final WorkerService service;

    @GetMapping
    public List<Worker> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Worker findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
