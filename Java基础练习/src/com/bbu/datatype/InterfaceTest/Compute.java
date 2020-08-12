package com.bbu.datatype.InterfaceTest;

/**
 * @description:
 * @author: liuzhi
 * @Date: 2020-08-11 15:11
 **/
public class Compute {
    public void PowerOn()
    {
        System.out.println("笔记本开机");
    }
    public void PowerOf()
    {
        System.out.println("笔记本关机");
    }
    public void useDevice(USB usb)
    {
        usb.OpenUSB();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.closeUSB();
        }

        System.out.println("使用USB");
    }

}
