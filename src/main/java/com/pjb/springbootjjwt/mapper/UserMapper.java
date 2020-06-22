package com.pjb.springbootjjwt.mapper;

import com.pjb.springbootjjwt.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author jinbin
 * @date 2018-07-08 20:44
 * IDEA报错Could not find bean的问题：
 * 1. 添加@Mapper，程序可以编译通过，但是UserService中仍然显示Could not find bean
 * 2. 添加 Component, Controller , Service ,Repository 四个注解中的任意一个都可以解决UserService中.
 * 四个注解功能是相同的. 但是为了语意明确, 应该使用 Component ,Repository 中的一个.
 */
@Mapper
@Component
public interface UserMapper {
    User findByUsername(@Param("username") String username);
    User findUserById(@Param("Id") String Id);
}
