package ru.practicum.item;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;

    @GetMapping
    public List<ItemDto> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public ItemDto getItem(@PathVariable @Valid Long id) {
        return itemService.getItemById(id);
    }

    @PostMapping
    public ItemDto createItem(
            @RequestHeader(value = "X-Sharer-User-Id") Long userId,
            @RequestBody @Valid ItemDto itemDto
    ) {
        return itemService.createItem(userId, itemDto);
    }

    @PatchMapping
    public ItemDto updateItem(
            @RequestHeader(value = "X-Sharer-User-Id") Long userId,
            @RequestBody @Valid ItemDto itemDto
    ) {
        return itemService.updateItem(itemDto);
    }
}
