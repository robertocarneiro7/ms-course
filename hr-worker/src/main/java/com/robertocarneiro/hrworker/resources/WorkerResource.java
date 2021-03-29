package com.robertocarneiro.hrworker.resources;

import com.robertocarneiro.hrworker.entities.Worker;
import com.robertocarneiro.hrworker.services.WorkerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
@RequiredArgsConstructor
@Slf4j
public class WorkerResource {

    private final WorkerService service;

    private final Environment env;

    @GetMapping
    public List<Worker> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Worker findById(@PathVariable Long id) {
        log.info("PORT = " + env.getProperty("local.server.port"));

        return service.findById(id);
    }
}
