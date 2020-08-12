package com.bbu.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @description: ArrayList的相关使用
 * @author: liuzhi
 * @Date: 2020-08-10 14:36
 **/
public class ArrayLis {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();


        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Amy");
        list1.add("MATH");
        list1.add("Duck");

        LinkedList<String>list2 = new LinkedList<String>();

        list2.add("Bob");
        list2.add("LOB");
        list2.add("Arch");
        list2.add("Cat");

        ListIterator<String>aIter = list1.listIterator();
        ListIterator<String>bIter = list2.listIterator();

        //将两个list合并
        while (bIter.hasNext()) //遍历list2
        {
            if (aIter.hasNext())
            {
                aIter.next();

            }
            aIter.add(bIter.next());
        }

        System.out.print(list1);
    }
}
