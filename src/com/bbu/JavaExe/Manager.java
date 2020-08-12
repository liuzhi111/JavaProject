package com.bbu.JavaExe;

/**
 * @description: Manager
 * @author: liuzhi
 * @Date: 2020-06-25 23:59
 **/
public class Manager extends Employee {
    private double bouns;

    public Manager(String n, double s, int year, int month, int day)
    {
        super(n,s,year,month,day);
        bouns = 0;
    }

    @Override
    public  double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker",80000,1987,9,20);
        boss.setBouns(5000);

        Employee [] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Jess Wel",50000,1989,2,26);
        staff[2] = new Employee("Halo Je",65000,1992,8,31);
        //给员工涨薪10%
        for (Employee e:staff)
        {
            e.raiseSalary(10); // 先普调，再按个人调薪
            System.out.println("name="+e.getName()+",salary="+e.getSalary());
        }

    }
}
