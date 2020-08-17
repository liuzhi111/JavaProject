package leetcode.tree;

import java.util.Scanner;

/**
 * @description: 1, 5, 10, 50, 100五种纸币，求找零所需最小纸币
 * @author: liuzhi
 * @Date: 2020-08-04 21:15
 **/
public class XunFei1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=6;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
            System.out.println(nums[i]);
        }
        int total_Num = MinNum(nums[0],nums[1],nums[2],nums[3],nums[4],nums[5]);
        System.out.print(total_Num);

    }
    public static int MinNum(int a,int b,int c,int d,int e,int k)
    {
        int res = 0;
        if(k >= 100 && e!=0){

            int s = k/100;  //
            System.out.println(s);
            if(s <= e) {  //先挑100,把能挑的挑完

                res += s;
                k = k % 100;
            } else {  //不够的话计算剩下的
                res += e;
                k = k - (e * 100);
            }
        }
        System.out.println("除去100之后的k = "+k);
        if(k >= 50 && d!=0) {

            int s = k / 50;//需要用多少张50

            if(s <= d) {    //再挑50
                res += s;
                k = k%50;
            } else {       //不够的话计算剩下的
                res += d;
                k = k - (d * 50);
            }
        }
        System.out.println("除去50之后的k = "+k);

        if(k >= 10 && c!=0) {
            int s = k/10;
            if(s <= c) {
                res += s;
                k = k%10;
            } else {
                res += c;
                k = k - (c * 10);
            }
        }
        System.out.println("除去10之后的k = "+k);

        if(k >= 5 && b!=0) {
            int s = k/5;
            if(s <= b) {
                res += s;
                k = k%5;
            } else {
                res += b;
                k = k - (b * 5);
            }
        }
        System.out.println("除去5之后的k = "+k);

        if(k <= a) {
            return res+k; //1元的
        } else {
            System.out.println("所需的钱不够");
            return -1;//1元的不够
        }


    }
}
