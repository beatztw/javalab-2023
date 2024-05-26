package ru.itis.webflux.webfluxservice.entities;

import lombok.Data;

import java.util.List;

@Data
public class ConsumersResponse {
    List<ConsumersRecord> data;
}
