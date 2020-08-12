package com.bbu.datatype;

//import javafx.util.Pair;

import javafx.util.Pair;

/**
 * @description:
 * @author: liuzhi
 * @Date: 2020-08-11 18:53
 **/
public class Pairtest {
    public static void main(String[] args) {
        String [] words = {"Mary","has","a","ipad"};
        Pair<String,String> mm = ArrayAlg.minmax(words);
        System.out.println("min = "+mm.getKey());
        System.out.println("max = "+mm.getValue());
    }


}
class ArrayAlg {
    public static Pair<String,String> minmax(String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (min.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}