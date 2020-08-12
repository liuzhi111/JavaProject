package com.jimmysun.algorithms.chapter1_1;

/**
 * @description: 数组处理代码的相关实现
 * @author: liuzhi
 * @Date: 2020-08-04 14:07
 **/
public class Array_Slove {
   public static int max_element(int [] a)
   {
       int max = a[0];
       for (int i=1;i<a.length;i++)
       {
           if (a[i] >max)
               max = a[i];
       }
       return max;
   }

   public static double average(int [] a)
   {
       int n = a.length;
       int sum = 0;
       for (int i=0;i<n;i++)
       {
           sum +=a[i];
       }
       double average_num = sum / n;
       return average_num;
   }
   public static int [] copy_array(int [] a) {
       int n = a.length;
       int[] b = new int[n];
       for (int i = 0; i < n; i++)
           b[i] = a[i];
        return b;
   }

}
