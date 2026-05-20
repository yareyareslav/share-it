package ru.practicum.request;

import ru.practicum.shared.mapper.TwoWayMapper;

public class ItemRequestToItemRequestDtoMapper implements TwoWayMapper<ItemRequest, ItemRequestDto> {
    @Override
    public ItemRequest toData(ItemRequestDto itemRequestDto) {
        return new ItemRequest(
                itemRequestDto.getId(),
                itemRequestDto.getDescription(),
                itemRequestDto.getRequestor(),
                null
        );
    }

    @Override
    public ItemRequestDto toPresentation(ItemRequest itemRequest) {
        return new ItemRequestDto(
                itemRequest.getId(),
                itemRequest.getRequestor(),
                itemRequest.getDescription()
        );
    }
}
