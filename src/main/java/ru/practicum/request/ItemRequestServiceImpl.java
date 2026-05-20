package ru.practicum.request;

import org.springframework.stereotype.Service;
import ru.practicum.item.ItemDto;

import java.util.List;

@Service
public class ItemRequestServiceImpl implements ItemRequestService {
    @Override
    public List<ItemDto> getAllItems() {
        return List.of();
    }

    @Override
    public ItemDto getItemById(Long id) {
        return null;
    }

    @Override
    public ItemDto createItem(ItemDto itemDto) {
        return null;
    }

    @Override
    public ItemDto updateItem(ItemDto itemDto) {
        return null;
    }
}
