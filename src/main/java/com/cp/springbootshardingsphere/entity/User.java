package com.cp.springbootshardingsphere.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description
 * @author: chenping
 * @create: 2019-12-03
 **/
@Data
public class User {
    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    /**
     * 是否删除 1删除 0未删除
     */
    private Integer status;
}
