package leetcode.tree;

/**
 * @description: 移除数组中的指定元素
 * @author: liuzhi
 * @Date: 2020-08-18 08:36
 **/
public class ReomveElement {
    public static int removeElement1(int []nums,int val)
    {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }else {
                continue;
            }
        }
        return i;
    }
    public static void main(String[] args) {

    }
}
