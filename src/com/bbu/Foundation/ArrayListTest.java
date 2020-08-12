package com.bbu.Foundation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description: java utils的使用
 * @author: liuzhi
 * @Date: 2020-06-18 18:58
 **/
public class ArrayListTest {
//    ArrayList<String>arr = new ArrayList<String>();
public static void main(String[] args) {
        List<String> list=new ArrayList<String>();   //ArrayList实现List接口
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        //第一种遍历方法使用 For-Each 遍历 List
        for (String str : list) {            //也可以改写 for(int i=0;i<list.size();i++) 这种形式
            System.out.println(str);
        }
        System.out.println("-----------------------------------");

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int i=0; i<strArray.length; i++) //这里也可以改写为  for(String str:strArray) 这种形式
        {
            System.out.println(strArray[i]);
        }

        System.out.println("-----------------------------------");
        //第三种遍历 使用迭代器进行相关遍历

        Iterator<String> ite=list.iterator();
        while(ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }


        //实现ArrayList的增删改查
        ArrayList<String>arrlist = new ArrayList<String>();
        arrlist.add("I hava a dream!");
        arrlist.add("Just a joke!");

        arrlist.remove(0);

    }
}
