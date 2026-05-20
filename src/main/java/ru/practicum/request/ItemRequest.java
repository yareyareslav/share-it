package ru.practicum.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.practicum.user.User;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ItemRequest {
    private Long id;
    private String description;
    private User requestor;
    private LocalDateTime created;
}
