package ru.itis.webflux.producersservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producers")
public class ProducersController {

    @GetMapping
    public List<Item> producers() {
        return List.of(
                Item.builder()
                        .name("Denis")
                        .countGoodsProduced(50)
                        .build(),

                Item.builder()
                        .name("Diana")
                        .countGoodsProduced(153)
                        .build(),

                Item.builder()
                        .name("Maria")
                        .countGoodsProduced(364)
                        .build());
    }
}
