package ru.itis.webflux.webfluxservice.clients;

import reactor.core.publisher.Flux;
import ru.itis.webflux.webfluxservice.entities.Statistic;


public interface Client {

    Flux<Statistic> getAll();

}
