package xin.jannchie;


import java.util.Stack;

import static java.lang.Math.pow;

/**
 * @author jannchie
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
public class Solution {


    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    public int findPeak(int[] a) {
        // write your code here
        int i=1,j = A.length-2;
        while (i <= j) {
            int m = (i + j) / 2;
            if (A[m] > A[m - 1] && A[m] > A[m + 1]) {
                return m;
            } else {
                if (A[m - 1] < A[m]) {
                    i = m + 1;
                } else {
                    j = m - 1;
                }
            }
        }
        return i;
    }

    public int maxProfit(int[] prices) {
        // write your code here
        int i = 0;
        int profit = 0;
        while (i < prices.length - 1) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
            i++;
        }
        return  profit;
    }

    public void deleteNode(ListNode node) {
        // write your code here
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }

    public int[] twoSum(int[] nums, int target) {
        // write your code here
        int[] index = new int[2];
        for (int index1 = 0; index1 < nums.length; index1++) {
            for (int index2 = index1 + 1; index2 < nums.length; index2++) {
                if (nums[index1] + nums[index2] == target) {
                    index[0] = index1 + 1;
                    index[1] = index2 + 1;
                    return index;
                }
            }
        }
        return index;
    }

    public int singleNumber(int[] a) {
        // write your code here
        int result = 0;
        for (int aA : a) {
            result ^= aA;
        }
//        for (int i = 0; i < a.length; i++) {
//            result ^= a[i];
//        }
        return result;
    }

    public TreeNode cloneTree(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        TreeNode  nRoot = new TreeNode(root.val);
        nRoot = root;
        if (nRoot.left != null) {
            nRoot.left = cloneTree(nRoot.left);
        }
        if (nRoot.right != null) {
            nRoot.right = cloneTree(nRoot.right);
        }
        return nRoot;
    }

    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if (root == null) {
            return;
        }
        TreeNode  temp = new TreeNode(root.val);

        if (root.left != null) {
            invertBinaryTree(root.left);
        }
        if (root.right != null) {
            invertBinaryTree(root.right);
        }

        root.right = temp;
        root.right = root.left;
        root.left = temp;


    }

    public int flipLights(int n, int m) {

        int lamp = n % 6;
        int operation = m % 4;
        boolean[] lampStatus = new boolean[lamp];
        return 0;
    }

    public boolean hasCycle(ListNode head) {
        // use
        ListNode slow = head;
        ListNode fast = head;
        if(head == null) {
            return false;
        }
        while(fast.next != null){
            fast = fast.next;
            if(fast.next != null) {
                fast = fast.next;
                slow = slow.next;
                if (fast == slow) {
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }

    /**
     * @param a: the root of binary tree a.
     * @param b: the root of binary tree b.
     * @return: true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        if(a == null && b == null){
            return true;
        }
        if(a == null){
            return false;
        }else if(b == null){
            return false;
        }

        return a.val == b.val && isIdentical(a.left,b.left)
                && isIdentical(a.right,b.right);
    }
}
