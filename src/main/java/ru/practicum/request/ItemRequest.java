package ru.practicum.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.practicum.item.Item;

@Data
@AllArgsConstructor
public class ItemRequest {
    private Long id;
    private Long userId;
    private Item requestedItem;
}
