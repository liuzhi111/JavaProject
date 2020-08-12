package leetcode.tree;

/**
 * @description: 查看两个矩形是否相交
 * @author: liuzhi
 * @Date: 2020-08-04 21:37
 **/
import java.util.Scanner;

public class XunFei3 {
    public static void main(String[] args) {
        //处理输入
        Scanner sc = new Scanner(System.in);
        int[][] square1 = new int[2][2], square2 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                square1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                square2[i][j] = sc.nextInt();
            }
        }

        if (xIn(square1, square2) && yIn(square1, square2)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

    public static boolean xIn(int[][] square1, int[][] square2) {
        return square2[0][0] >= square1[0][0] && square2[0][0] <= square1[1][0];
    }

    public static boolean yIn(int[][] square1, int[][] square2) {
        return square2[0][1] >= square1[0][1] && square2[0][0] <= square1[1][1];
    }
}
