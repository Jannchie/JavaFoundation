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
        // write your code here
        if (root == null) {
            return 0;
        }
        int depth = 1;
        int maxDepth = 1;
        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(root);
        TreeNode temp = root;
        while (temp != null || !treeNodeStack.empty()) {
            while (temp != null) {
                treeNodeStack.push(temp);
                temp = temp.left;
                depth++;
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
            if (!treeNodeStack.empty()) {
                temp = treeNodeStack.pop();
                depth--;
                temp = temp.right;
            }
        }
        return  maxDepth;
    }
}