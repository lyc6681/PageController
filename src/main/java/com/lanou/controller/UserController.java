package com.lanou.controller;

import com.lanou.bean.User;
import com.lanou.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;

/**
 * Created by dllo on 2017/8/19.
 */
@Controller
@SessionAttributes("account")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(User user, ModelMap model){
        if (userService.findBypassword(user)==null){
            return "user/login";
        }else {
            User user1 = userService.findBypassword(user);
            model.addAttribute("account",user1);
            return "user/index";
        }
    }



}
