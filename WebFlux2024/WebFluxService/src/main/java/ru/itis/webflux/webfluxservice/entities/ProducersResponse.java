package ru.itis.webflux.webfluxservice.entities;

import lombok.Data;

import java.util.List;

@Data
public class ProducersResponse {
    List<ProducersRecord> data;
}
