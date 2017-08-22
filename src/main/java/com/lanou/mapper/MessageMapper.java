package com.lanou.mapper;

import com.lanou.bean.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 2017/8/18.
 */
@Repository
public interface MessageMapper {

    List<Message> findAll();
    Message findByUId(@Param("id")Integer id);
    Message findById(@Param("id")Integer id);
    void addNew(Message message);
    void delete(Integer id);
    void update(Message message);

}
