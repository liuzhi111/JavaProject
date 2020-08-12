package com.bbu;

import java.sql.Date;

/**
 * @description: 进行反射机制的学习
 * @author: liuzhi
 * @Date: 2020-06-27 10:51
 **/
public class Reflect {
    public static void main(String[] args) {
        Class cl1 = Date.class;
        Class cl2 = int.class;
        Class cl3 = double.class;
        System.out.println(Double [].class.getName());
        System.out.println(Integer[].class.getName());
        System.out.println(int.class.getName());
        System.out.println(double.class.getName());
    }
}
