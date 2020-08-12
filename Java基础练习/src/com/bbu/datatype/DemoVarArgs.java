package com.bbu.datatype;

/**
 * @description:
 * @author: liuzhi
 * @Date: 2020-08-11 20:04
 **/
public class DemoVarArgs {
    public static void main(String[] args) {
        int i = add(10,20,30);
        System.out.println(i);
    }

    public static int add(int...arr)
    {
        int sum =0 ;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
