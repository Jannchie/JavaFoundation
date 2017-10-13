package xin.jannchie;

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
        if(root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? (leftDepth + 1) : (rightDepth + 1);
    }
}