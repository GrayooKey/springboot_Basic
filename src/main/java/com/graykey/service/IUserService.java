package com.graykey.service;

import com.graykey.module.User;

import java.util.List;

public interface IUserService {

    User addUser(User user);

    void delUser(String id);

    User updateUser(User user);

    User queryUser(String id);

    List<User> queryUserList();

}
