package com.petshop.petshopbackendproject.service;


import com.petshop.petshopbackendproject.model.User;
import com.petshop.petshopbackendproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public boolean findUserByEmailAndPassword(String email, String password) {

        User user = userRepository.findByEmail(email);

        if(user != null && user.getPassword().equals(password))
            return true;

        return false;

    }

    @Override
    public boolean checkEmailExists(String email) {

        User user = userRepository.findByEmail(email);

        if(user != null) {
            return true;
        }
        return false;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
