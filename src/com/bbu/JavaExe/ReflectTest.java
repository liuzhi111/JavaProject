package com.bbu.JavaExe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @description: 用于测试反射机制的方法
 * @author: liuzhi
 * @Date: 2020-06-27 11:00
 **/
public class ReflectTest {
    public static void main(String[] args) {

        String name;
        if (args.length>0)
            name = args[0];
        else{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name:");
            name = in.next();
        }
        try {
            Class cl1 = Class.forName(name);
            Class superclass = cl1.getSuperclass();
            String modifiers = Modifier.toString(cl1.getModifiers());
            if (modifiers.length() > 0)
            {
                System.out.println(modifiers + " ");
            }
            System.out.println("class" +name);
            if (superclass !=null && superclass != Object.class)
                System.out.println("extends "+superclass.getName());

            System.out.println();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void printConstructor(Class c)
    {
        Constructor [] constructors = c.getDeclaredConstructors();


        for (Constructor c1:constructors)
        {
            String name = c1.getName();   //获取类名称
            System.out.println();
            String modifiers = Modifier.toString(c1.getModifiers());  //返回 int
            if (modifiers.length() > 0)
            {
                System.out.println(modifiers + " ");
            }
            System.out.println("class" +name);


//            Class[] paras  = c.getTypeParameters();


        }
    }
    public static void printMethods(Class c1)
    {
        try {
            Class stuClass3 = Class.forName("fanshe.Student");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
//            System.out.println(stuClass3 == stuClass2);//判断三种方式是否获取的是同一个Class对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
