package com.cxb.consumermovie.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/10/15
 */
@Setter
@Getter
public class User {

    private Long id;

    private String name;

    private String username;

    private Integer age;

    private BigDecimal balance;
}
