package 二叉搜索树与双向链表;

public class Solution {
    TreeNode pre = null;
    TreeNode head = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }
    public void inOrder(TreeNode root){
        if(root == null)return;
        inOrder(root.left);
        root.left = pre;
        if(pre != null)
            pre.right = root;
        pre = root;
        if(head == null)head = pre;
        inOrder(root.right);
    }

}
