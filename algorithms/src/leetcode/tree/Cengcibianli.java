package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * @description: 层次遍历
 * @author: liuzhi
 * @Date: 2020-07-18 22:15
 **/
public class Cengcibianli {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //树为空
        if (root == null)
            return new ArrayList<List<Integer>>();
        //用来返回最终的结果
        List<List<Integer>>res = new ArrayList<List<Integer>>();

        LinkedList<TreeNode>queue = new LinkedList<TreeNode>();  //链式列表

        queue.add(root);// 将根节点放入队列中
        while (queue.size() >0)
        {
            int size = queue.size();
            ArrayList<Integer> tmp = new ArrayList<Integer>(); //暂时存放结果

            for (int i=0;i<size;i++)
            {
                TreeNode t = queue.remove();
                tmp.add(t.val);
                if (t.left != null)
                    queue.add(t.left);
                if (t.right != null)
                    queue.add(t.right);
            }
            res.add(tmp);
        }
        return res;
    }
}
