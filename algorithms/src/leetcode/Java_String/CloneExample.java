package leetcode.Java_String;

/**
 * @description: Clone的相关实现
 * @author: liuzhi
 * @Date: 2020-08-05 21:17
 **/
public class CloneExample {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private int b;

    @Override
    public CloneExample clone() throws CloneNotSupportedException{
        return (CloneExample)super.clone();
    }

    public static void main(String[] args) {
        CloneExample e1 = new CloneExample();
        try {
            CloneExample e2 = e1.clone();  //调用会抛异常，需要捕获异常

        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
