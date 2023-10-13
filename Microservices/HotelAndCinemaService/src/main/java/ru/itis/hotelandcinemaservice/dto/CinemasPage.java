package ru.itis.hotelandcinemaservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.hotelandcinemaservice.dto.response.CinemaResponse;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CinemasPage {
    private List<CinemaResponse> cinemas;

    private Integer totalPages;
}
