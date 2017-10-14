package xin.jannchie;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */

    public int maxDepth(TreeNode root) {
        // write your code (here)
        if (root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? (leftDepth + 1) : (rightDepth + 1);
    }

    /**
    * @param root: A Tree
    * @return: Preorder in ArrayList which contains node values.
    */
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        } else {
            pre(root,list);
            return list;
        }
    }

    public List<Integer> pre(TreeNode root,List<Integer> list) {
        if (root.left != null) {
            pre(root.left,list);
        }
        list.add(root.val);
        if (root.right != null) {
            pre(root.right,list);
        }
        return list;
    }

}