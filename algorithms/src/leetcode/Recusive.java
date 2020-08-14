package leetcode;

/**
 * @description: 递归实现斐波那契数列
 * @author: liuzhi
 * @Date: 2020-08-14 10:22
 **/
public class Recusive {
    public  static long Fibonacci_Solution2(int n)
    {
        int[] result ={0,1};
        if(n<2){
            return result[n];
        }
        double fibNMinusOne = 1;
        double fibNMinusTwo = 0;
        double fibN = 0;
        for (int i=2;i<=n;i++)
        {
            fibN = fibNMinusOne +fibNMinusTwo;

            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }
        return (long)fibN;
    }
    public static void Test(int n,int expected){
        if(Fibonacci_Solution2(n) == expected) {
            System.out.printf("Test for %d in solution2 passed.\n",n);
        } else {
            System.out.printf("Test for %d in solution2 failed.\n",n);
        }
    }

    public static void main(String[] args) {
        Test(0, 0);
        Test(1, 1);
        Test(2, 1);
        Test(3, 2);
        Test(4, 3);
        Test(5, 5);
        Test(6, 8);
        Test(7, 13);
        Test(8, 21);
        Test(9, 34);
        Test(10, 55);


    }
}
