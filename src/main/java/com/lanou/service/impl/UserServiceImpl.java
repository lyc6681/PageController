package com.lanou.service.impl;

import com.lanou.bean.User;
import com.lanou.mapper.UserMapper;
import com.lanou.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dllo on 2017/8/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    public User findBypassword(User user) {
        return mapper.findBypassword(user);
    }
}
