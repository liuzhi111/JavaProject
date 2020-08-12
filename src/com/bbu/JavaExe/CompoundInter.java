package com.bbu.JavaExe;

/**
 * @description: exercise
 * @author: liuzhi
 * @Date: 2020-06-25 12:25
 **/
public class CompoundInter {
    public static void main(String[] args) {
        final double STARTARTE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        double [] interestRate = new double[NRATES];//数组
        for (int j=0;j<interestRate.length;j++)
        {
            interestRate[j]  = (STARTARTE +j)/100.0;
        }
        double [][] balances = new double[NYEARS][NRATES];

        for (int i=0;i<balances.length;i++)
        {
            balances[0][i] = 10000;
        }
        double oldBalance;
        for (int i=0;i<balances[i].length;i++)
            for (int j=0;j<balances[i].length;j++)
                oldBalance = balances[i-1][j];

    }
}
