package ru.itis.webflux.webfluxservice.clients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import ru.itis.webflux.webfluxservice.entities.ConsumersResponse;
import ru.itis.webflux.webfluxservice.entities.Statistic;

import java.util.Arrays;

@Component
public class ConsumersWebClient implements Client {

    private final WebClient client;

    public ConsumersWebClient(@Value("${consumersService.api.url}") String url) {
        client = WebClient.builder()
                .baseUrl(url)
                .build();
    }

    @Override
    public Flux<Statistic> getAll() {
        return client.get()
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(ConsumersResponse.class))
                .flatMapIterable(ConsumersResponse::getData)
                .map(record ->
                        Statistic.builder()
                                .name(record.getName())
                                .from("ConsumersService")
                                .build());
    }
}
