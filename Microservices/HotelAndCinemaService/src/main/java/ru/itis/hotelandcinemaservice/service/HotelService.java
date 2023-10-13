package ru.itis.hotelandcinemaservice.service;

import ru.itis.hotelandcinemaservice.dto.HotelsPage;

public interface HotelService {
    HotelsPage getAllHotels(Integer page);

    HotelsPage getAllHotelsByCity(String city, Integer page);
}
