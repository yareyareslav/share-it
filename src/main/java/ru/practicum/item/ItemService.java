package ru.practicum.item;

import java.util.List;

public interface ItemService {
    List<ItemDto> getAllItems();

    ItemDto getItemById(Long id);

    ItemDto createItem(Long userId, ItemDto itemDto);

    ItemDto updateItem(ItemDto itemDto);
}
