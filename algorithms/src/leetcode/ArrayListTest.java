package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @description: 找出数组中重复的数字
 * @author: liuzhi
 * @Date: 2020-08-12 09:24
 **/
public class ArrayListTest {
    public static void getRepeateNum( int[] num) {
        int NumChange;
        System.out.println("重复数字是：");
        for(int index = 0; index < num.length; index++) {
            while(num[index] != index) {
                if(num[index] == num[num[index]]) {
                    System.out.print(num[index]+" ");
                    break;
                } else {
                    NumChange = num[num[index]];
                    num[num[index]] = num[index];
                    num[index] = NumChange;
                }
            }
        }
    }

    //使用hashMap找出数组中的重复元素
    public static boolean getRepeated(int []num,int length,int []duplication)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(length<2) return false;
        for(int i=0;i<length;i++){
            if(map.containsKey(num[i])){
                duplication[0]=num[i];
                return true;
            }
            else{
                map.put(num[i],1);
            }
        }
        return false;
    }


    //题目二：在一个
    public static int duplicate(int []num)
    {
        HashMap<Integer,Integer> countMap=new HashMap<Integer,Integer>();
        if (num.length<2||num==null) {
            System.out.println("no");
            return 0;
        }

        int i = 1;
        int k = 0;
        ArrayList res= new ArrayList();
        for(int j=0;j<num.length;j++){
            if(countMap.get(num[j])==null){
                countMap.put(num[j], i);
            }
            else{
                res.add(num[j]);
                k++;
            }
        }

        for(i=0; i < res.size(); i++){
            System.out.print(res.get(i)+" ");
        }


        return 1;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        int n = scanner.nextInt(); //读取数组长度的数字

        int[] num = new int[n];   //数组长度可以自己定义
        System.out.println("请输入一组数据：");
        for(int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        int []duplication = new int[num.length];
        getRepeated(num,num.length,duplication);
    }

}
