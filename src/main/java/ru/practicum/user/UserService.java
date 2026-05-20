package ru.practicum.user;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();

    UserDto getUserById(Long id);

    UserDto createUser(User user);

    UserDto updateUser(Long id, UserDto userDto);

    void deleteUser(Long id);
}
