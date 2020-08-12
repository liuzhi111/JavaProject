package com.bbu.JavaExe;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @description: Employee
 * @author: liuzhi
 * @Date: 2020-06-25 23:50
 **/
public class Employee implements Comparable<Employee>,Cloneable{
    private String name;
    private double salary;
    private int year;
    private int month;
    private int day;
    private Date hireDay;
    public Employee(String name,double salary,int year,int month,int day)
    {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        hireDay  = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee other)
    {
        if (salary < other.salary)
            return -1;
        if (salary > other.salary)
            return 1;
        return 0;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException
    {
        Employee cloned = (Employee)super.clone();

        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    public String toString()
    {
        return "Employee[name=" +name+",salary="+salary+",hireDay="+hireDay+"]";
    }
}
