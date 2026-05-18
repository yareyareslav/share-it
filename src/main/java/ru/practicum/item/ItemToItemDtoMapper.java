package ru.practicum.item;

import ru.practicum.shared.mapper.TwoWayMapper;

public class ItemToItemDtoMapper implements TwoWayMapper<Item, ItemDto> {
    @Override
    public Item toData(ItemDto itemDto) {
        return new Item(
                itemDto.getId(),
                itemDto.getOwnerId(),
                itemDto.getName(),
                itemDto.getDescription(),
                itemDto.getIsAvailableForRent()
        );
    }

    @Override
    public ItemDto toPresentation(Item item) {
        return new ItemDto(
                item.getId(),
                item.getOwnerId(),
                item.getName(),
                item.getDescription(),
                item.getIsAvailableForRent()
        );
    }
}
