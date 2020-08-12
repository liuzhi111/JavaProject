package leetcode.tree;

/**
 * @description: 求树的最大深度
 * @author: liuzhi
 * @Date: 2020-07-18 21:24
 **/
public class BigDepth {
    public static int maxDepth(TreeNode root)
    {
        if (root == null)
            return 1;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static void main(String[] args) {
        
    }
}
