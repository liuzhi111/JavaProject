package com.bbu.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 实现斗地主的发牌和洗牌功能
 * @author: liuzhi
 * @Date: 2020-08-11 16:10
 **/
public class DouDiZhu {
    public static void main(String[] args) {
        Map<Integer,String>map = new HashMap<>();
        ArrayList<String> pocks = new ArrayList<>(); //存放54张牌

        String[] color = {"黑桃", "红桃", "梅花", "方块"};//存储花色

        String[] numbers = {"2","A","K", "Q","J","10","9","8","7","6","5", "4", "3" };
        pocks.add("大王");
        pocks.add("小王");
        //循环遍历两个数组，组装52张牌
        int index = 0;
        map.put(index,"大王");

        for (String number : numbers) { //14种牌
            for (String s : color) {  //四种颜色
                pocks.add(s + number);
            }
        }
        for(int i = 0; i< pocks.size(); i++)
        {
            map.put(i,pocks.get(i));
        }
        System.out.println(map);
        //派组装好了

//        System.out.println(pocks);
        //洗牌
        Collections.shuffle(pocks);
//        System.out.println(pocks);
        //发牌
        ArrayList<String> player01 = new ArrayList<String>();
        ArrayList<String> player02 = new ArrayList<String>();
        ArrayList<String> player03 = new ArrayList<String>();
        ArrayList<String> diPai = new ArrayList<String>();
        /*
        遍历pocks集合，获取每一张牌
        使用pocks集合的索引%3，给每个玩家轮流发牌
        剩余三张牌给底牌
        注意：
            先判断底牌(i>=51)，否则底牌发没了
         */
        for (int i = 0; i < pocks.size(); i++) {
            String p = pocks.get(i);
            if (i >= 51) {  //将后三张留作底牌
                diPai.add(pocks.get(i));
            } else if (i % 3 == 0) {
                player01.add(pocks.get(i));
            } else if (i % 3 == 1) {
                player02.add(pocks.get(i));
            } else {
                player03.add(pocks.get(i));
            }
        }
        //看牌
        System.out.println("play01:" + player01);
        System.out.println("play02:" + player02);
        System.out.println("play03:" + player03);
        System.out.println("diPai:"  + diPai);

    }
}
