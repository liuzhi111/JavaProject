package com.bbu.Foundation;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * @description: java util包中的hashtable的使用
 * @author: liuzhi
 * @Date: 2020-06-18 19:35
 **/
public class HashTableTest {
    public static void main(String[] args) {
        //构造一个新的，空的散列表，默认初始容量（11）和负载因子（0.75）。
        Hashtable<String,Integer>table = new Hashtable<String,Integer>();
        //[1]添加元素
        table.put("zhangsan", 22);
        table.put("lisi", 33);
        table.put("wangwu", 44);
        table.put("zhaoliu",55);

        //[2]toString()方式打印
        System.out.println(table.toString());

        //[3]Iterator遍历方式1--键值对遍历entrySet()
        Iterator<Map.Entry<String, Integer>> iter = table.entrySet().iterator();
//        Iterator<Map.Entry<String,Integer>> iter = table.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)iter.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("entrySet:"+key+" "+value);
        }

        System.out.println("====================================");

        //[4]Iterator遍历方式2--key键的遍历
        Iterator<String> iterator = table.keySet().iterator(); //对hashtable中key进行迭代
        while(iterator.hasNext()){
            String key = (String)iterator.next();
            int value = table.get(key);   //由key找value
            System.out.println("keySet:"+key+" "+value);
        }

        System.out.println("====================================");

        //[5]通过Enumeration来遍历Hashtable
        Enumeration<String> enu = table.keys();
        while(enu.hasMoreElements()) {
            System.out.println("Enumeration:"+table.keys()+" "+enu.nextElement());
        }

    }



}
