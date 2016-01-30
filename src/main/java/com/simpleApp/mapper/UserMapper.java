package com.simpleApp.mapper;


import com.simpleApp.model.User;
import com.simpleApp.util.MyMapper;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper extends MyMapper<User> {
    public User findUserInfo();
}
