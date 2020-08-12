package com.bbu.JavaExe;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @description: test
 * @author: liuzhi
 * @Date: 2020-06-25 12:47
 **/
public class CalendarTest {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);   //25
        int month = d.get(Calendar.MONTH);          //5

        System.out.printf("today= %d,month = %d",today,month);
        d.set(Calendar.DAY_OF_MONTH,1);   //设置为1月

        int weekday = d.get(Calendar.DAY_OF_WEEK);  //2
        int firstDayOfWeek = d.getFirstDayOfWeek(); //1

        System.out.printf("weekday= %d,firstDayOfWeek = %d",weekday,firstDayOfWeek);
        System.out.println();

        int ident = 0;
        while (weekday !=firstDayOfWeek)
        {
            ident++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }
        System.out.printf("weekday= %d,firstDayOfWeek = %d",weekday,firstDayOfWeek);// 1  1
        System.out.println();

        String [] weekNames = new DateFormatSymbols().getShortWeekdays();
        Arrays.toString(weekNames);

        do {
            System.out.printf("%4s",weekNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);

        }while (weekday != firstDayOfWeek);
        System.out.println();

        for (int i = 1; i <= ident; i++)
            System.out.print("   ");

        d.set(Calendar.DAY_OF_MONTH , 1);
        do {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d",day);
            if (day == today)
                System.out.printf("*");
            else
                System.out.print(" ");

            d.add(Calendar.DAY_OF_MONTH,1);
            weekday = d.get(Calendar.DAY_OF_WEEK);

            if (weekday == firstDayOfWeek)
                System.out.println();
        }while (d.get(Calendar.MONTH)==month);

        if (weekday !=firstDayOfWeek)
            System.out.println();

    }
}
