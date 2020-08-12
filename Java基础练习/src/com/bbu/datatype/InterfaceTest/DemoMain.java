package com.bbu.datatype.InterfaceTest;

/**
 * @description:
 * @author: liuzhi
 * @Date: 2020-08-11 15:14
 **/
public class DemoMain {

    public static void main(String[] args) {
        Compute computer = new Compute();
        computer.PowerOn();


        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        KeyBoard keyboard = new KeyBoard();
        //向上转型,将keyboard转型为USB
        computer.useDevice(keyboard);
        computer.PowerOf();
    }
}
