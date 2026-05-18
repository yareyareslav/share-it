package ru.practicum.item;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private Long id;
    private Long ownerId;
    private String name;
    private String description;
    private Boolean isAvailableForRent;
}
