package ru.practicum.booking;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
    private Long id;
    @NotNull
    private Long userId;
    @NotNull
    private Long itemId;
    @NotNull
    private LocalDate startRentDate;
    @NotNull
    private LocalDate endRentDate;
    @NotNull
    private Boolean isSubmittedByOwner;
}
