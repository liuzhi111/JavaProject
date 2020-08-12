package com.bbu.JavaExe;

/**
 * @description: 泛型类的使用
 * @author: liuzhi
 * @Date: 2020-06-30 21:25
 **/
public class Pair<T> {


    private T first;
    private T second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public Pair()
    {
        first = null;
        second = null;
    }

    public Pair(T first,T second)
    {
        this.first = first;
        this.second = second;
    }

}
