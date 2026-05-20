package ru.practicum.booking;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startRentDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endRentDate;
    private Long itemId;
    private Long bookerId;
    private BookingStatus status;
}
