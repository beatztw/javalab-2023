package ru.itis.webflux.consumersservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumersController {

    @GetMapping("/consumers")
    public List<Item> consumers() throws InterruptedException {
//        Thread.sleep(5000);
        List<Item> list = List.of(
                Item.builder()
                        .name("Alex")
                        .email("alex@mail.ru")
                        .age(21)
                        .build(),

                Item.builder()
                        .name("Maksim")
                        .email("maks@mail.ru")
                        .age(23)
                        .build(),

                Item.builder()
                        .name("Vladimir")
                        .email("vlad@mail.ru")
                        .age(23)
                        .build()
        );
        return list;
    }
}
