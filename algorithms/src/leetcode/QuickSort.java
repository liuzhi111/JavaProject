package leetcode;

import java.util.Random;

/**
 * @description: 实现快速排序的相关算法
 * @author: liuzhi
 * @Date: 2020-08-14 14:07
 **/
public class QuickSort {
    public static int Partition(int []numbers,int length,int start,int end) throws Exception {
        if (numbers == null || numbers.length <= 0 || start < 0 || end >= length) {
            throw new Exception("Invalid Parameters");
        }
        //对一个数组进行排序
        int len = numbers.length;
        int small = start - 1;
        int temp = 0;
        Random random = new Random();
        int index = random.nextInt((end - start + 1) + start); //start~end之间的一个随机整数
        for (index = start; index < end; index++) {
            if (numbers[index] < numbers[end]) {
                ++small;
                if (small != index) {
                    temp = numbers[index];
                    numbers[index] = numbers[small];
                    numbers[small] = temp;
                }
            }
        }
        ++small;
        return small;
    }
    public  static void Swap(int data1,int data2){
        int temp = data1;
        data1 = data2;
        data2 = temp;
    }

    public static void QuickSortSolution1(int[] data,int length,int start,int end) throws Exception {
        if (start ==end) {
            return;
        }
        int index = Partition(data,length,start,end);

        if (index > start) {
            QuickSortSolution1(data,length,start,index-1);
        }
        if (index <end) {
            QuickSortSolution1(data,length,index+1,end);
        }

    }
    public static void main(String[] args) {

    }
}
