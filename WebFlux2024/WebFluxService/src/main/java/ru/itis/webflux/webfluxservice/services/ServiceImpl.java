package ru.itis.webflux.webfluxservice.services;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
import ru.itis.webflux.webfluxservice.clients.Client;
import ru.itis.webflux.webfluxservice.entities.Statistic;

import java.util.List;

@Component
public class ServiceImpl implements Service {

    private final List<Client> clients;

    public ServiceImpl(List<Client> clients) {
        this.clients = clients;
    }


    @Override
    public Flux<Statistic> getAll() {
        List<Flux<Statistic>> fluxes = clients.stream().map(this::getAll).toList();
        return Flux.merge((fluxes));
    }

    private Flux<Statistic> getAll(Client client) {
        return client.getAll()
                .subscribeOn(Schedulers.boundedElastic());
    }

}
