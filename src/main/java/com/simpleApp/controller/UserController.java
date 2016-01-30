package com.simpleApp.controller;

import com.simpleApp.model.User;
import com.simpleApp.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
            logger.info("user.getAge():"+user.getAge());
        }
        return user;
    }

    @RequestMapping("test")
    public String test (){
        return "index" ;
    }

    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers(){
        List<User> list=new ArrayList<User>();

        User user=new User();
        user.setName("hello");
        list.add(user);

        User user2=new User();
        user2.setName("world");
        list.add(user2);
        return list;
    }

    @RequestMapping(value="/{name}",method=RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable String name){
        User user=new User();
        user.setName("hello world");
        return user;
    }
}
