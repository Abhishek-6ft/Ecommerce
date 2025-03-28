package com.Abhishek.Ecommerce.Service;

import com.Abhishek.Ecommerce.Entity_Model.User;
import com.Abhishek.Ecommerce.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user)
    {
        try {
            User newUser = userRepository.save(user);
            System.out.println("User added to data base");
            return newUser;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public User loginUser(String email, String password) {

        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password))
        {
            return user;
        }
        return null; // invalid credentioals
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
