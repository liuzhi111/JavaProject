package com.bbu.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @description: LinkedList的相关使用
 * @author: liuzhi
 * @Date: 2020-08-10 15:00
 **/
public class LinkedLis {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.get(1));
        for (int i=0;i<sites.size();i++)
        {
            System.out.print(sites.get(i)+" ");

        }
        System.out.println();
        ListIterator<String>a = sites.listIterator();

        while (a.hasNext())
        {
            a.next();
            System.out.print(a.next()+" ");
        }
    }

}
