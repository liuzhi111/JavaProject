package com.bbu.datatype;

import java.math.BigInteger;

/**
 * @description: 大数值类的使用
 * @author: liuzhi
 * @Date: 2020-08-03 17:27
 **/
public class BigDecimal {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(100);
        BigInteger b = BigInteger.valueOf(20);
        BigInteger c = a.add(b) ; // c = a + b
        BigInteger d = c.multiply(b.add(BigInteger.valueOf(2))); // d = c * (b + 2)
        System.out.println(d);

        if (args.length ==0 || args[0].equals("-h"))
            System.out.print("Hello,");
        else if (args[0].equals("-g"))
            System.out.print ("Goodbye,");
            // print the other command-line arguments
        for (int i = 1; i < args.length; i ++)
            System.out.print(" " + args[i]);
        System.out.println("!") ;



    }
}
