package 按之字形打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret =new ArrayList<>();

        if(pRoot == null)return ret;
        int row = 1;
        ArrayList<Integer>list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        while(!queue.isEmpty()){
            list= new ArrayList<>();
            int n = queue.size();
            for(int i = 0; i<n; i++){
                TreeNode t = queue.poll();
                if(row%2 == 0){
                    list.add(0, t.val);
                }else {
                    list.add(t.val);
                }
                if(t.left != null)
                {
                    queue.add(t.left);
                }
                if(t.right != null){
                    queue.add(t.right);
                }
            }
            row++;
            ret.add(list);
        }

        return ret;
    }
}
