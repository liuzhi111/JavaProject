package com.bbu.datatype;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @description: Java面向对象的学习
 * @author: liuzhi
 * @Date: 2020-08-03 19:43
 **/
public class MyClass {
    public static void main(String[] args) {

        //显示当月的日历，当前日用一个*标记
        LocalDate date = LocalDate.now(); //2020-08-03
        System.out.println(date);
        int month = date.getMonthValue() ;  //判断是几月
        int today = date.getDayOfMonth() ;  //判断这个月有多少天

        date = date.minusDays(today - 1); // 生成当前日期之后或之前n天的日期

        //得到当前日期是星期几
        DayOfWeek weekday = date.getDayOfWeek() ;
        int value = weekday.getValue();  //1 = Monday, ... 7 = Sunday
        System.out.println("Mon Tue Wed Thu Fri Sat Sun") ;

        for (int i = 1; i < value; i++)
            System.out.print(" ");

        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth()) ;
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1) ;
            if (date.getDayOfWeek() .getValue() == 1)
                System.out.println();
        }

        if (date.getDayOfWeek().getValue()!= 1)
            System.out.println() ;
    }
}
