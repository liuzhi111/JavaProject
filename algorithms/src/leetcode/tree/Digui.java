package leetcode.tree;


/**
 * @description: 练习递归调用的相关方法
 * @author: liuzhi
 * @Date: 2020-08-04 19:49
 **/
public class Digui {

    //递推的方法实现

    public static int fn(int n)
    {
        if (n<=2) {
            return n;
        }
        int f1=1;
        int f2=2;
        int sum=0;

        for (int i=3;i<=n;i++)
        {
            sum=f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        return sum;
    }
    //递归的方法实现
    public static int fn1(int n)
    {
        if (n <= 2) {
            return n;
        }
        int [] arr = new int[n];

        if (arr[n] != -1)
        {
            return arr[n];
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
