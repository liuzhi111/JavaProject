package com.bbu.datatype;

//import com.sun.glass.ui.Size;

import java.util.Scanner;

/**
 * @description: 枚举类型的相关实现
 * @author: liuzhi
 * @Date: 2020-08-11 09:22
 **/

enum Size
{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRAL_LARGE("EL");
    private String abb;
    private Size(String abb){this.abb = abb;}
    public String getAbb(){return this.abb;}
}
public class EnumTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a size:(Small,Medium,Large,Extral_Large)");

        String input = scan.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);

        System.out.println("size="+size);
        System.out.println("abb= "+size.getAbb());

        if (size == Size.EXTRAL_LARGE)
            System.out.println("Good job,you paid attention to the _");

    }
}
