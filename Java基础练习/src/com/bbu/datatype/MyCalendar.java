package com.bbu.datatype;

/**
 * @description: 编写一个万年历，输入一个日期，则显示当月的日历，并标出当前是那天
 * @author: liuzhi
 * @Date: 2020-08-03 20:33
 **/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyCalendar {

    public static void main(String[] args) {
        myCalendar();
    }

    public static void myCalendar() {

        int maxDay = 0;
        int firstDay = 0;
        int currentDay = 0;

        System.out.println("请输入一个日期：格式为：2030-03-10");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();	//键盘输入日期格式的字符串

        try {

            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(str);	//将字符串转化为指定的日期格式

            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);	//将日期转化为日历

            maxDay = calendar.getActualMaximum(Calendar.DATE);	//当前日期中当前月对应的最大天数

            currentDay = calendar.get(Calendar.DATE);	//当前日期中的当前天
            calendar.set(Calendar.DATE, 1); // 设置为当前月的第一天

            firstDay = calendar.get(Calendar.DAY_OF_WEEK);	//当前日期中当前月第一天对应的星期数

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("日\t一\t二\t三\t四\t五\t六\n");
        for (int j = 1; j < firstDay; j++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= maxDay; i++) {
            if (i == currentDay) {
                System.out.print("*");
            }
            System.out.print(i + "\t");
            if ((i - (8 - firstDay)) % 7 == 0) {
                System.out.println("\n");
            }

        }
    }
}
