package com.bbu.datatype.InterfaceTest;

/**
 * @description:
 * @author: liuzhi
 * @Date: 2020-08-11 14:57
 **/
public class Mouse implements USB {

    @Override
    public void OpenUSB() {
        System.out.println("打开鼠标");
    }

    @Override
    public void closeUSB() {
        System.out.println("关闭鼠标");

    }
    public static void click()
    {
        System.out.println("点击鼠标");
    }
}
