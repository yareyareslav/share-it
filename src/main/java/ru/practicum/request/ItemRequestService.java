package ru.practicum.request;

import ru.practicum.item.ItemDto;

import java.util.List;

public interface ItemRequestService {
    List<ItemDto> getAllItems();

    ItemDto getItemById(Long id);

    ItemDto createItem(ItemDto itemDto);

    ItemDto updateItem(ItemDto itemDto);
}
