package 把二叉树打印成多行;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if(pRoot == null)return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        ArrayList<Integer> list;
        while(!queue.isEmpty()){
            list = new ArrayList<>();
            int n = queue.size();
            for(int i = 0; i< n;i++){
                TreeNode t = queue.poll();
                list.add(t.val);
                if(t.left!=null)queue.add(t.left);
                if(t.right!= null)queue.add(t.right);
            }
            ret.add(list);
        }
        return ret;
    }
}
