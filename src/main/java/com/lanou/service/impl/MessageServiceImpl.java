package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.bean.Message;
import com.lanou.mapper.MessageMapper;
import com.lanou.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 2017/8/18.
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Resource
    private MessageMapper mapper;

    public List<Message> findAll() {
        return mapper.findAll();
    }

    public void addNew(Message message) {
        mapper.addNew(message);
    }

    public void delete(Integer id) {
        mapper.delete(id);
    }

    public void upUpdate(Integer id) {
        Message message = mapper.findById(id);
        message.setUp(message.getUp() + 1);
        mapper.update(message);
    }

    public void downUpdate(Integer id) {
        Message message = mapper.findById(id);
        message.setDown(message.getDown() + 1);
        mapper.update(message);
    }

    public PageInfo<Message> queryPage(Integer pageNum, Integer pageSize) {

        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 5 : pageSize;

        PageHelper.startPage(pageNum,pageSize);
        List<Message> messages = mapper.findAll();
        //使用PageInfo对查询结果进行包装
        PageInfo<Message> pageInfo = new PageInfo<Message>(messages);
        return pageInfo;
    }


}
