package com.cp.springbootshardingsphere.mapper;

import com.cp.springbootshardingsphere.entity.User;

import java.util.List;

/**
 * @description
 * @author: chenping
 * @create: 2019-12-03
 **/
public interface UserMapper {
    /**
     * 插入一条记录
     *
     * @param record 实体对象
     * @return 更新条目数
     */
    int insert(User record);

    /**
     * 获取所有用户
     */
    List<User> selectAll();
}
