package ru.itis.webflux.producersservice;

import lombok.Builder;

@Builder
public class Item {

    public String name;
    public Integer countGoodsProduced;

    public Item(String name, Integer countGoodsProduced) {
        this.name = name;
        this.countGoodsProduced = countGoodsProduced;
    }
}
