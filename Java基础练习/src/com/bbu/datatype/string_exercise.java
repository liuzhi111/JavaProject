package com.bbu.datatype;

import java.util.Scanner;

/**
 * @description: 练习Java数据类型字符串的使用
 * @author: liuzhi
 * @Date: 2020-08-03 16:53
 **/
public class string_exercise {
    public static void main(String[] args) {
        String e =" ";
        String greeting = "hello";
        //字串的截取
        String s =greeting.substring(0,3);
        System.out.println(s);
        //字符串的拼接
        String expletive = "Expletive";
        String PG13 = "delete";
        String s1 = expletive + " "+PG13;
        System.out.println(s1);


        StringBuilder builder = new StringBuilder();
        String ch ="hello";
        String str = "I'm coming!";
        builder.append(ch);
        builder.append(",");
        builder.append(str);
        String completed = builder.toString();
        System.out.println(completed);


        //输入和输出
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name:");
        String name = in.nextLine();

//        String firstName = in.next();
        System.out.println("How old are you?");
        int age = in.nextByte();
        System.out.println("Hello,"+name+".Next year,you'll be "+(age+1));

    }
}
