package ru.itis.hotelandcinemaservice.service;

import ru.itis.hotelandcinemaservice.dto.CinemasPage;

public interface CinemaService {
    CinemasPage getAllCinemas(Integer page);

    CinemasPage getAllCinemasByCity(String city, Integer page);
}
