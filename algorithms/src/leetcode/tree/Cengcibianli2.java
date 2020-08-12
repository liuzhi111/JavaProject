package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 使用层次遍历遍历树，并返回倒序
 * @author: liuzhi
 * @Date: 2020-07-19 09:54
 **/
public class Cengcibianli2 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //存放最终的结果
        ArrayList<List<Integer>>res = new ArrayList<>();
        if (root == null)
            return res;
        //存放节点
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (queue.size()>0)
        {
            int size = queue.size();
            ArrayList<Integer>tmp = new ArrayList<>();//存放节点的值
            for (int i=0; i<size; i++)
            {
                TreeNode node = queue.remove();
                tmp.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            res.add(0,tmp);
        }
        return res;

    }
    public static void main(String[] args) {

    }
}
