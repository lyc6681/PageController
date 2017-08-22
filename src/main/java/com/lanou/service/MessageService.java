package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dllo on 2017/8/18.
 */
public interface MessageService {
    List<Message> findAll();
    void addNew(Message message);
    void delete(Integer id);
    void upUpdate(@Param("id")Integer id);
    void downUpdate(@Param("id")Integer id);
    PageInfo<Message> queryPage(Integer pageNum,Integer pageSize);

}
