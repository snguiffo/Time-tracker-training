package com.training.timetracker.services;

import com.training.timetracker.models.User;

import java.util.List;

public interface IUserService {
    List <User> getAllUsers ();
    User getUserById ();
    User deleteUserById ();

    Long saveUser(User user);
}
