package ru.itis.webflux.webfluxservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ConsumersRecord {
    @JsonProperty("name")
    private String name;
    private String email;
    private Integer age;
}
