package ru.practicum.item;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Long id;
    private Long ownerId;
    @NotBlank
    private String name;
    private String description;
    @NotBlank
    private Boolean isAvailableForRent;

}
