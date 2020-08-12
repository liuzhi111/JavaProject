package com.bbu.JavaExe;

/**
 * @description: Construct para passing in Java
 * @author: liuzhi
 * @Date: 2020-06-25 17:13
 **/
public class Para {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Para(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent /100;
        salary += raise;
    }


}
