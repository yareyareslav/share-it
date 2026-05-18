package ru.practicum.booking;

import ru.practicum.shared.mapper.TwoWayMapper;

public class BookingToBookingDtoMapper implements TwoWayMapper<Booking, BookingDto> {
    @Override
    public Booking toData(BookingDto bookingDto) {
        return new Booking(
                bookingDto.getId(),
                bookingDto.getUserId(),
                bookingDto.getItemId(),
                bookingDto.getStartRentDate(),
                bookingDto.getEndRentDate(),
                bookingDto.getIsSubmittedByOwner());
    }

    @Override
    public BookingDto toPresentation(Booking booking) {
        return new BookingDto(
                booking.getId(),
                booking.getUserId(),
                booking.getItemId(),
                booking.getStartRentDate(),
                booking.getEndRentDate(),
                booking.getIsSubmittedByOwner()
        );
    }
}
