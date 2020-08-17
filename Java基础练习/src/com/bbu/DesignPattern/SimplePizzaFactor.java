package com.bbu.DesignPattern;

/**
 * @description: 工厂模式
 * @author: liuzhi
 * @Date: 2020-08-16 20:08
 **/
public class SimplePizzaFactor {
    public Pizza createPizza(String type)
    {
        return new Pizza();
    }
    public SimplePizzaFactor(){}
}
