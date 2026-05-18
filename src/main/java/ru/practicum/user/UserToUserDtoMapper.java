package ru.practicum.user;

import ru.practicum.shared.mapper.TwoWayMapper;

public class UserToUserDtoMapper implements TwoWayMapper<User, UserDto> {
    @Override
    public User toData(UserDto userDto) {
        return new User(
                userDto.getUserId(),
                userDto.getEmail(),
                userDto.getName()
        );
    }

    @Override
    public UserDto toPresentation(User user) {
        return new UserDto(
                user.getId(),
                user.getEmail(),
                user.getName()
        );
    }
}
