package leetcode.tree;

import java.util.Stack;

/**
 * @description: 遍历树
 * @author: liuzhi
 * @Date: 2020-07-18 21:42
 **/

public class BianliTree {

    //前序遍历的递归实现
    public static void PreOrderRe(TreeNode node) {
        System.out.println(node.val); //访问根
        TreeNode leftTree  = node.left;

        if (leftTree != null)
            PreOrderRe(leftTree);
        TreeNode rightTree = node.right;
        if (rightTree !=null)
            PreOrderRe(rightTree);

    }

    public static void PreOrder(TreeNode node) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
//        stack.empty();
        while(node != null || !stack.isEmpty()) //节点存在或栈非空
        {
            while(node != null)
            {
                System.out.println(node.val); //节点不空 直接访问
                stack.push(node);
                node = node.left;
            }
            if(!stack.isEmpty())
            {
                node = stack.pop();
                node = node.right;
            }
            
        }

    }

    public static void main(String[] args) {
       TreeNode [] nodes = new TreeNode[10];
       for (int i=0;i<10;i++)
       {
           nodes[i] = new TreeNode(i);
       }
        for (int i = 0; i < 10; i++) {
            if (i*2+1 <10)
                nodes[i].left = nodes[i*2+1];
            if (i*2+2 <10)
                nodes[i].right = nodes[i*2+2];
        }
        PreOrderRe(nodes[0]);
    }
}
