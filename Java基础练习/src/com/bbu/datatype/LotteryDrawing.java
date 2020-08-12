package com.bbu.datatype;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description: 用来测试数组的相关操作
 * @author: liuzhi
 * @Date: 2020-08-03 19:32
 **/
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you have to draw?");
        int k =in.nextInt();

        System.out.print("What's the highest numberyou can draw?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i=0;i<numbers.length;++i)
        {
            numbers[i] = i+1;
        }

        int[] result = new int[k] ;
        for (int i = 0; i < result.length; i++)
        {
        // make a random index between 0 and n - 1
            int r = (int) (Math.random() * n);
        // pick the element at the random location
            result[i] = numbers[r];
        // move the last element into the random location
            numbers[r] = numbers[n - 1] ;
            n--;
        }
        // print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result)
            System.out.println(r) ;
    }
}
