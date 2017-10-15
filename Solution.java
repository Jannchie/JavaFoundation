package xin.jannchie;

/**
 * @author jannchie
 */
public class Solution {


    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
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
        for (int index_1 = 0; index_1 < nums.length; index_1++) {
            for (int index_2 = index_1 + 1; index_2 < nums.length; index_2++) {
                if (nums[index_1] + nums[index_2] == target) {
                    index[0] = index_1 + 1;
                    index[1] = index_2 + 1;
                    return index;
                }
            }
        }
        return index;
    }

    public int singleNumber(int[] A) {
        // write your code here
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        return result;
    }
}