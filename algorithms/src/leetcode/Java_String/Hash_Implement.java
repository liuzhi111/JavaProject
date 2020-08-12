package leetcode.Java_String;

/**
 * @description: 实现hash的相关操作
 * @author: liuzhi
 * @Date: 2020-08-09 17:23
 **/
public class Hash_Implement {
    public static int hash(String key,int tablesize)
    {
        int hashVal = 0;
        for (int i=0;i<key.length();i++)
        {
            hashVal += key.charAt(i); //将i转换成char


        }
        return hashVal % tablesize;

    }

    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap();
    }

    private static class BinaryHeap {
    }
}
