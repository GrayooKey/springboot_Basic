package com.graykey.service.impl;

import com.graykey.dao.UserRepository;
import com.graykey.module.User;
import com.graykey.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User addUser(User user) {
        User u = this.userRepository.save(user);
        return u;
    }

    @Override
    public void delUser(String id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        User u = this.userRepository.save(user);
        return u;
    }

    @Override
    public User queryUser(String id) {
        /*User user = this.userRepository.getOne(id);*/
        User user = this.userRepository.findById(id).get();
        return user;
    }

    @Override
    public List<User> queryUserList() {
        List<User> userList = this.userRepository.findAll();
        return userList;
    }

}
