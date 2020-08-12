package com.bbu.datatype;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @description: 泛型编程
 * @author: liuzhi
 * @Date: 2020-08-11 15:41
 **/
public class GenericProgramming {
    public static void main(String[] args) {
        show01();
        show02();
        ArrayList<String >list01 = new ArrayList<>();

        list01.add("A");
        list01.add("B");

        ArrayList<Integer>list02 = new ArrayList<>();
        list02.add(2);
        list02.add(3);
        printArray(list01);
        printArray(list02);


    }
    private static void printArray(ArrayList <?> list)
    {
        ArrayList<?> arrayList = list;
        Iterator<?>iterator  = arrayList.iterator();
        while (iterator.hasNext())
        {
            Object onj = iterator.next();
        }
    }
    private static void show01()
    {
        ArrayList <String>arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");

        Iterator <String>it = arrayList.iterator();

        while (it.hasNext()){
            String obj = it.next();  //取出元素
            System.out.println(obj);

            String s = (String)obj;
            System.out.println(s.length());
        }
    }
    private static void show02()
    {

    }

}
