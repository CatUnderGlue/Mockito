package ru.catunderglue.service.impl;

import ru.catunderglue.model.User;
import ru.catunderglue.repository.UserRepository;
import ru.catunderglue.repository.impl.UserRepositoryImpl;
import ru.catunderglue.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl() {
        this.userRepository = new UserRepositoryImpl();
    }

    @Override
    public boolean checkUserExist(User user) {
        List<User> allUsers = userRepository.getAllUsers();
        return allUsers.contains(user);
    }
}
