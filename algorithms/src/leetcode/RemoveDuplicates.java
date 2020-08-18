package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @description:
 * @author: liuzhi
 * @Date: 2020-08-17 21:54
 **/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums)
    {
        HashSet <Integer>set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Iterator <Integer>iterator = set.iterator();
        ArrayList<Integer> list=new ArrayList<>();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }
        for (int i=0;i<list.size();i++)
        {
            nums[i] = list.get(i);
            System.out.println(nums[i]);
        }

        return set.size();
    }
    public static void main(String[] args) {
        int []num = {1,1,2,3};
        int nums = removeDuplicates(num);
        System.out.println(nums);

    }
}
