package ru.practicum.request;

import ru.practicum.shared.mapper.TwoWayMapper;

public class ItemRequestToItemRequestDtoMapper implements TwoWayMapper<ItemRequest, ItemRequestDto> {
    @Override
    public ItemRequest toData(ItemRequestDto itemRequestDto) {
        return new ItemRequest(
                itemRequestDto.getId(),
                itemRequestDto.getUserId(),
                itemRequestDto.getRequestedItem()
        );
    }

    @Override
    public ItemRequestDto toPresentation(ItemRequest itemRequest) {
        return new ItemRequestDto(
                itemRequest.getId(),
                itemRequest.getUserId(),
                itemRequest.getRequestedItem()
        );
    }
}
