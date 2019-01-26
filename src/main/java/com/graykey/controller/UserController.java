package com.graykey.controller;

import com.graykey.module.User;
import com.graykey.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping(value = "/add")
    public User addUser(User user){
        user.setCreateDate(new Date());
        User u = this.userServiceImpl.addUser(user);
        return u;
    }

    @RequestMapping(value = "/del")
    public String delUserById(String id){
        this.userServiceImpl.delUser(id);
        return "删除成功！";
    }

    @RequestMapping(value = "/update")
    public User updateUser(User user){
        User u = this.userServiceImpl.updateUser(user);
        return u;
    }

    @RequestMapping(value = "/getOneById")
    public User queryUser(String id){
        User u = this.userServiceImpl.queryUser(id);
        return u;
    }

    @RequestMapping(value = "/getAll")
    public List<User> queryUserList(){
        List<User> userList = this.userServiceImpl.queryUserList();
        return userList;
    }

}
