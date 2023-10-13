package ru.itis.hotelandcinemaservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.hotelandcinemaservice.model.Cinema;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CinemaResponse {
    private Long id;
    private String title;
    private String city;

    public static CinemaResponse from(Cinema cinema) {
        return CinemaResponse.builder()
                .id(cinema.getId())
                .title(cinema.getTitle())
                .city(cinema.getCity())
                .build();
    }

    public static List<CinemaResponse> from(List<Cinema> cinemas){
        return cinemas.stream()
                .map(CinemaResponse::from)
                .toList();
    }
}
