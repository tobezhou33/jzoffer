package 二叉搜索树的第K个结点;

public class Solution {
    private int index;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot != null){
            TreeNode node = KthNode(pRoot.left, k);
            if(node != null){
                return node;
            }
            index ++;
            if(index == k){
                return pRoot;
            }
            node = KthNode(pRoot.right, k);
            if(node != null){
                return node;
            }
        }
        return null;
    }
}
