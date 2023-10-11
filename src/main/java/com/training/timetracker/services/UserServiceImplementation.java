package com.training.timetracker.services;

import com.training.timetracker.models.User;
import com.training.timetracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById() {
        return null;
    }

    @Override
    public User deleteUserById() {
        return null;
    }

    @Override
    public Long saveUser(User user){
        User _user = userRepository.save (user);
        return _user.getId();
    }
}
