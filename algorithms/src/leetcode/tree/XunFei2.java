package leetcode.tree;

/**
 * @description: 给定一个数列和按某种排序方式每一步生成的数列，输出每一步
 * @author: liuzhi
 * @Date: 2020-08-04 21:32
 **/
import java.util.Scanner;

public class XunFei2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //对输入的数据进行深拷贝
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        quicksort(nums, 0, n - 1);
    }
    //快排
    public static void quicksort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = partition(nums, left, right);
        print(nums);
        quicksort(nums, left, mid - 1);
        quicksort(nums, mid + 1, right);
    }

    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static int partition(int[] nums, int left, int right) {
        if (left >= right) {
            return left;
        }
        int i = left;
        int j = right;
        int key = nums[left];
        while (i < j) {
            while (i < j && nums[j] >= key) {
                j--;
            }
            while(i < j && nums[i] <= key) {
                i++;
            }
            if(i < j){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        nums[left] = nums[i];
        nums[i] = key;
        return i;
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}