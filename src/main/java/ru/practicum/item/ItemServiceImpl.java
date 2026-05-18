package ru.practicum.item;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    @Override
    public List<ItemDto> getAllItems() {
        return List.of();
    }

    @Override
    public ItemDto getItemById(Long id) {
        return null;
    }

    @Override
    public ItemDto createItem(Long userId, ItemDto itemDto) {
        return null;
    }

    @Override
    public ItemDto updateItem(ItemDto itemDto) {
        return null;
    }
}
