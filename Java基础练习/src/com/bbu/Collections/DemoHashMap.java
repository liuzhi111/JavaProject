package com.bbu.Collections;

import java.util.*;

/**
 * @description: hashmap的相关使用
 * @author: liuzhi
 * @Date: 2020-08-10 15:09
 **/
public class DemoHashMap {
    public static void main(String[] args) {
        HashMap <String,String>map = new HashMap<>();
        map.put("111","liu");
        map.put("222","wang");
        map.put("333","ja");

        System.out.println(map);

        map.remove("111");

        map.forEach((k,v) ->   //for-Each
                System.out.println("key="+k+" ,value= "+v));

        for (String i : map.keySet()) //遍历键值
            System.out.println("key="+i+" ,value= "+map.get(i)); //多种遍历方法

        Iterator<Map.Entry<String,String> >iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String ,String >entry = iterator.next();
            System.out.println("key = "+entry.getKey()+",value= "+entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }
        //linkedHashMap是一个有序的集合，存储元素和取出的元素相同
        LinkedHashMap<String,String>linkedHashMap = new LinkedHashMap<>();

    }
}
