package ru.catunderglue.repository;

import ru.catunderglue.model.User;

import java.util.List;

public interface UserRepository {
    User getUserByName(String name);
    List<User> getAllUsers();
}
