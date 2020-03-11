package 二叉树的下一个结点;

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null)return null;
        if(pNode.right != null){
            pNode = pNode.right;
            while(pNode.left != null)pNode = pNode.left;
            return pNode;
        }
        while(pNode.next != null){
            if(pNode == pNode.next.left)return pNode.next;
            if(pNode == pNode.next.right)pNode = pNode.next;
        }
        return null;
    }
}
