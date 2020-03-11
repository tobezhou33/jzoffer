package 二叉搜索树的后序遍历序列;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)return false;
        return verify(sequence,0,sequence.length -1);
    }
    public boolean verify(int[] sequence, int start, int end){
        if(end <= start)return true;
        int i = start;
        for(; i< end;i++){
            if(sequence[i] > sequence[end])break;
        }
        for(int j = i;j < end;j++){
            if(sequence[j] < sequence[end])return false;
        }
        return verify(sequence, start, i-1)&&verify(sequence, i, end -1 );
    }
}
