package ru.catunderglue.repository.impl;

import ru.catunderglue.model.User;
import ru.catunderglue.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    public static final List<User> users = new ArrayList<>();

    public UserRepositoryImpl() {
        users.add(new User("Maksim"));
        users.add(new User("Miksam"));
        users.add(new User("Maskim"));
    }

    @Override
    public User getUserByName(String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findAny().orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
