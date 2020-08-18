package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * @description: 找数组中第三大的数
 * @author: liuzhi
 * @Date: 2020-08-17 16:00
 **/
public class Find3Largest {
    public static int Find3Largest(int []numbers)
    {
        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!list.contains(numbers[i])){
                list.add(numbers[i]);

            }
        }
        if (list.size() <3){
            return  list.get(list.size()-1);
        }
        return  list.get(list.size()-3);

    }
    public static int Find3Largest2(int []numbers)
    {
        TreeSet<Integer>set = new TreeSet<>();
        for (int n:numbers) {
            set.add(n);
            if (set.size() >3)
            {
                set.remove(set.first());
            }
        }
        return set.size() <3 ?set.last() :set.first();

    }
    public static void main(String[] args) {
        int [] numbers = {2,4,5,2,1,1,4,5};
        int num = Find3Largest2(numbers);
        System.out.println(num);

    }
}
