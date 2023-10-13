package ru.itis.hotelandcinemaservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.hotelandcinemaservice.controller.api.HotelControllerApi;
import ru.itis.hotelandcinemaservice.dto.HotelsPage;
import ru.itis.hotelandcinemaservice.service.HotelService;

@RestController
@RequiredArgsConstructor
public class HotelController implements HotelControllerApi {
    private final HotelService hotelService;
    @Override
    public HotelsPage getAllHotels(Integer page) {
        return hotelService.getAllHotels(page);
    }

    @Override
    public HotelsPage getAllHotelsByCity(String city, Integer page) {
        return hotelService.getAllHotelsByCity(city, page);
    }
}
