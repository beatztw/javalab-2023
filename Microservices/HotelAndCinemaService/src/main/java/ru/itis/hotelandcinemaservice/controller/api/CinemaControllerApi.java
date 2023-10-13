package ru.itis.hotelandcinemaservice.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.itis.hotelandcinemaservice.dto.CinemasPage;

@RequestMapping("/api/v1/cinema")
public interface CinemaControllerApi {
    @GetMapping("/info")
    @ResponseStatus(HttpStatus.OK)
    CinemasPage getAllCinemas(@RequestParam("page") Integer page);
    @GetMapping("/info-by-city")
    @ResponseStatus(HttpStatus.OK)
    CinemasPage getAllCinemasByCity(@RequestParam("city") String city, @RequestParam("page") Integer page);
}
