package ru.itis.hotelandcinemaservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.hotelandcinemaservice.dto.response.HotelResponse;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelsPage {
    private List<HotelResponse> hotels;

    private Integer totalPages;
}
