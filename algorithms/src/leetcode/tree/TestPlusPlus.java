package leetcode.tree;

/**
 * @description:
 * @author: liuzhi
 * @Date: 2020-08-18 08:48
 **/
public class TestPlusPlus {
    public static void main(String[] args) {
        int i=0;
        int a = i++;
        System.out.println("a = "+a+" ,i++ = "+i);

        int j=1;
        int b=++j;
        System.out.println("b = "+b+" ,++j = "+j);
    }
}
