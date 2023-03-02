package ru.catunderglue.service;

import ru.catunderglue.model.User;

public interface UserService {
    boolean checkUserExist(User user);
}
