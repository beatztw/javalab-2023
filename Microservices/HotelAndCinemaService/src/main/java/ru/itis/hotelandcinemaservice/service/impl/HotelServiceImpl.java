package ru.itis.hotelandcinemaservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.itis.hotelandcinemaservice.dto.HotelsPage;
import ru.itis.hotelandcinemaservice.model.Hotel;
import ru.itis.hotelandcinemaservice.repository.HotelRepository;
import ru.itis.hotelandcinemaservice.service.HotelService;

import java.util.List;

import static ru.itis.hotelandcinemaservice.dto.response.HotelResponse.from;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;
    @Override
    public HotelsPage getAllHotels(Integer page) {
        PageRequest pageRequest = PageRequest.of(page, 2, Sort.by("id"));

        Page<Hotel> hotels = hotelRepository.findAll(pageRequest);
        List<Hotel> hotelList = hotelRepository.findAll();
        return HotelsPage.builder()
                .hotels(from(hotelList))
                .totalPages(hotels.getTotalPages())
                .build();
    }

    @Override
    public HotelsPage getAllHotelsByCity(String city, Integer page) {
        PageRequest pageRequest = PageRequest.of(page, 2, Sort.by("id"));

        Page<Hotel> hotels = hotelRepository.findAllByCity(city, pageRequest);
        List<Hotel> hotelList = hotelRepository.findAllByCity(city);
        return HotelsPage.builder()
                .hotels(from(hotelList))
                .totalPages(hotels.getTotalPages())
                .build();
    }
}
