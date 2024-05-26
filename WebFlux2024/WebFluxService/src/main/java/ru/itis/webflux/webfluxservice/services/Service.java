package ru.itis.webflux.webfluxservice.services;


import reactor.core.publisher.Flux;
import ru.itis.webflux.webfluxservice.entities.Statistic;


public interface Service {
    Flux<Statistic> getAll();
}
