package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.api.model.User;

@Service
public class UserService {
    
    private List<User> listUser;

    public UserService(){

        this.listUser = new ArrayList<>();
        
        User user1 = new User(1,"Ida", "ida@mail.com");
        User user2 = new User(2,"Hans", "hans@mail.com");
        User user3 = new User(3,"Lars","lars@mail.com");
        User user4 = new User(4,"Ben","ben@mail.com");
        User user5 = new User(5,"Eva",  "eva@mail.com");

        this.listUser.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(int id){
        Optional<User> optional = Optional.empty();
        for (User user : listUser) {
            if (user.getId() == id) return optional = Optional.of(user);
                       }
        return optional; 
    }
}
