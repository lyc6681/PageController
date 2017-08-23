package com.lanou.controller;


import com.github.pagehelper.PageInfo;
import com.lanou.bean.Message;
import com.lanou.bean.User;
import com.lanou.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dllo on 2017/8/18.
 */
@Controller
@SessionAttributes("account")
public class MBController {
    @Resource
    private MessageService messageService;


    @RequestMapping(value = "/addNew")
    @ResponseBody
    public List<Message> addNewMsg(@RequestParam("content") String ct,@ModelAttribute("account") User user){

        //需要service层对发送的数据做处理:数据查询/保存....

        Message message = new Message();
        message.setTime(new Timestamp(System.currentTimeMillis()));
        message.setContent(ct);
        message.setUser(user);
        messageService.addNew(message);
        return getAll();
    }

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public List<Message> getAll(){
        List<Message> list = messageService.findAll();
        System.out.println(list);
        return list;
    }
    @RequestMapping(value = "/delete")
    public String deleteMB(@RequestParam("mid") Integer id){
        messageService.delete(id);
        return null;
    }
    @RequestMapping(value = "/upUpdate")
    public String upUpdate(@RequestParam("mid") Integer id){
        messageService.upUpdate(id);
        return null;
    }
    @RequestMapping(value = "/downUpdate")
    public String downUpdate(@RequestParam("mid") Integer id){
        messageService.downUpdate(id);
        return null;
    }
    @RequestMapping(value = "/pagetest")
    @ResponseBody
    public PageInfo<Message> pagetest(){
        return messageService.queryPage(1,3);
    }


    @RequestMapping(value = "/test")
    @ResponseBody
    public String gittest(){
        return "bbb";
    }
    //编辑代码
    @RequestMapping(value = "/branch")
    @ResponseBody
    public String branchTest(){

        
        return "branch";
    }



    public void test(){
        System.out.println("test");
    }

    public void ttttt(){
        System.out.println("sadasd");
        System.out.println("asdas");
        //怎么那么烦人
    }



    public static void main(String[] args) {

    }




}
