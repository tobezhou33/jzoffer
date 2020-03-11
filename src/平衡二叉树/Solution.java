package 平衡二叉树;

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return getRoot(root) != -1;
    }
    public int getRoot(TreeNode root){
        if(root == null)return 0;
        int left = getRoot(root.left);
        if(left == -1)return -1;
        int right = getRoot(root.right);
        if(right == -1)return -1;
        return Math.abs(left - right)> 1?-1:1 + Math.max(left, right);
    }
}
