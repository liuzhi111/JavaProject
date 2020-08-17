package leetcode.tree;

import java.util.Scanner;

/**
 * @description: 从输入的字符串中提取整数
 * @author: liuzhi
 * @Date: 2020-08-04 21:43
 **/

//考虑负负得正
public class XunFei4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();  //输入一串字符串

        System.out.println("输入的字符串为: "+str);

        long number = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i); //取字符
            if (isDigit(c)) { //判断是否为数字

                number *= 10;
                number += c - '0';
            }

            if (c == '-') {
                flag *= -1;
            }
        }
        System.out.print(number * flag);
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
