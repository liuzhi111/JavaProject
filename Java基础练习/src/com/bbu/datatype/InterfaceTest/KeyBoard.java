package com.bbu.datatype.InterfaceTest;

/**
 * @description:
 * @author: liuzhi
 * @Date: 2020-08-11 14:57
 **/
public class KeyBoard implements USB{
    @Override
    public void OpenUSB() {
        System.out.println("打开键盘");

    }


    @Override
    public void closeUSB() {
        System.out.println("关闭键盘");
    }

    public static void click_on()
    {
        System.out.println("敲击键盘");
    }
}
