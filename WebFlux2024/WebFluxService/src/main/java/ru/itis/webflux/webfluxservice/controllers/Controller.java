package ru.itis.webflux.webfluxservice.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.itis.webflux.webfluxservice.entities.Statistic;
import ru.itis.webflux.webfluxservice.services.Service;


@AllArgsConstructor
@RestController
@RequestMapping("/allStatistic")
public class Controller {

    private final Service service;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Statistic> getAll() {
        return service.getAll();
    }
}
