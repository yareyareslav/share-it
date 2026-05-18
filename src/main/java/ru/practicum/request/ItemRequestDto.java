package ru.practicum.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.practicum.item.Item;

@Data
@AllArgsConstructor
public class ItemRequestDto {
    private Long id;
    @NotNull
    private Long userId;
    @NotNull
    private Item requestedItem;
}
