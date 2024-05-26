package ru.itis.webflux.consumersservice;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Item {

    public String name;
    public String email;
    public Integer age;

    public Item(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
