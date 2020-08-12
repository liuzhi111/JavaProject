package com.bbu.InnerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @description: 2
 * @author: liuzhi
 * @Date: 2020-06-26 12:01
 **/
public class TimerPrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("At the tone,the time is "+now);
    }
}
