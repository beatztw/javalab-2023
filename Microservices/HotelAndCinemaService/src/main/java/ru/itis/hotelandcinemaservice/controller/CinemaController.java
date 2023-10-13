package ru.itis.hotelandcinemaservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.hotelandcinemaservice.controller.api.CinemaControllerApi;
import ru.itis.hotelandcinemaservice.dto.CinemasPage;
import ru.itis.hotelandcinemaservice.service.CinemaService;

@RestController
@RequiredArgsConstructor
public class CinemaController implements CinemaControllerApi {
    private final CinemaService cinemaService;
    @Override
    public CinemasPage getAllCinemas(Integer page) {
        return cinemaService.getAllCinemas(page);
    }

    @Override
    public CinemasPage getAllCinemasByCity(String city, Integer page) {
        return cinemaService.getAllCinemasByCity(city, page);
    }
}
