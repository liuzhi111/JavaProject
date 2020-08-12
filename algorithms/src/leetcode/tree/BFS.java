//package leetcode.tree;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
///**
// * @description: 使用广度优先进行树的层次遍历
// * @author: liuzhi
// * @Date: 2020-07-18 23:11
// **/
//public class BFS {
//    public static List<List<Integer>> levelOrderBottom(TreeNode root)
//    {
//        if (root == null) {
//            return new List<List<Integer>>;
//        }
//
//        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
//        LinkedList<TreeNode>queue = new LinkedList<TreeNode>();
//        queue.add(root);
//
//        while (queue.size() > 0)
//        {
//            ArrayList<Integer>tmp = new ArrayList<Integer>();
//            TreeNode t = queue.remove(); //弹出队列中的元素
//            tmp.add(t.val);
//            if (t.left != null)
//                queue.add(t.left);
//            if (t.right != null)
//                queue.add(t.right);
//            res.add(tmp);
//        }
//
//    }
//}
