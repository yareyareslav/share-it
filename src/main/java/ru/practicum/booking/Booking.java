package ru.practicum.booking;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Booking {
    @NotNull
    private Long id;
    @NotNull
    private Long userId;
    @NotNull
    private Long itemId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startRentDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endRentDate;
    @NotNull
    private Boolean isSubmittedByOwner;
}
