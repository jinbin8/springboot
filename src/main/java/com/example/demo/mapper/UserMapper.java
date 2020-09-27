package com.example.demo.mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhuangzhuang
 * @since 2020-06-15
 */
@Mapper
public interface UserMapper{
    List<User> getUser();
}
