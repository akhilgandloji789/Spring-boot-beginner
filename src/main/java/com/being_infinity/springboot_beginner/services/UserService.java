package com.being_infinity.springboot_beginner.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.being_infinity.springboot_beginner.models.User;

@Service
public class UserService {

    private List<User> allUsers;
    private int curId=3;

    public UserService() {

        allUsers = new ArrayList<>();

        allUsers.add(new User(
                1,
                "John",
                "Male",
                "/images/john.png"
        ));

        allUsers.add(new User(
                2,
                "Jane",
                "Female",
                "/images/jane.png"
        ));
    }

    public List<User> getAllUsers() {
        return allUsers;
    }

    public User getUserById(int id) {

        for (int i = 0; i < allUsers.size(); i++) {

            if (allUsers.get(i).getId() == id) {
                return allUsers.get(i);
            }
        }

        return null;
    }
    
    public User addnewUser(User user){
        user.setId(curId);
        curId++;
        allUsers.add(user);
        return user;
    }
}