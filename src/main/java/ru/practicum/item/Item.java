package ru.practicum.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.practicum.request.ItemRequest;
import ru.practicum.user.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private Long id;
    private String name;
    private String description;
    private boolean available;
    private User owner;
    private ItemRequest request;
}
