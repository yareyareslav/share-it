package ru.practicum.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.practicum.user.User;


@Data
@AllArgsConstructor
public class ItemRequestDto {
    private Long id;
    @NotNull
    private User requestor;
    @NotBlank
    private String description;
}
