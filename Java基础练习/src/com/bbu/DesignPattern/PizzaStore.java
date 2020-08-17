package com.bbu.DesignPattern;

/**
 * @description: 练习单例模式的使用
 * @author: liuzhi
 * @Date: 2020-08-16 19:33
 **/
public abstract class PizzaStore {
    SimplePizzaFactor factor;
    public PizzaStore(SimplePizzaFactor factor)
    {
        this.factor = factor;
    }

    public Pizza orderPizza(String type)
    {
        Pizza pizza;
        pizza = factor.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return  new Pizza();
    }
}
