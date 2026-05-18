package ru.practicum.user;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    UserDto getUserById(Long id);

    User saveUser(User user);

    UserDto updateUser(Long id);
}
