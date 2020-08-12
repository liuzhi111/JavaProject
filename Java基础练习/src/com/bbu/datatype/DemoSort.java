package com.bbu.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @description:
 * @author: liuzhi
 * @Date: 2020-08-11 20:15
 **/

/*
* Comparator 和Comparable
* Comparable：自己和别人参数的比较
* Comparator：重写指定的规则*/
public class DemoSort {
    public static void main(String[] args) {
        ArrayList<Integer>list01 = new ArrayList<>();
        Collections.addAll(list01,3,3,2,3,4);

        System.out.println(list01);
        Collections.sort(list01);
        System.out.println(list01);



        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list01);
    }

}
