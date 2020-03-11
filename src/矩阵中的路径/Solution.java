package 矩阵中的路径;

public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean[] flag = new boolean[matrix.length];
        for(int i = 0; i< rows; i++){
            for(int j = 0; j < cols; j++){
                if(jude(matrix, rows, cols, flag, str, i, j, 0)){
                    return true;
                }
            }
        }
        return false;

    }
    public boolean jude(char[] matrix, int rows, int cols, boolean[] flag, char[] str, int i, int j, int k){
        int index = i*cols + j;
        if(i<0||j<0||i>=rows||j>=cols||matrix[index] != str[k]||flag[index] == true){
            return false;
        }
        if(k == str.length-1){
            return true;
        }
        flag[index] = true;
        if(jude(matrix, rows, cols, flag, str, i-1, j, k+1) ||
                jude(matrix, rows, cols, flag, str, i+1, j, k+1) ||
                jude(matrix, rows, cols, flag, str, i, j-1, k+1) ||
                jude(matrix, rows, cols, flag, str, i, j+1, k+1)){
            return true;
        }
        flag[index] = false;
        return false;
    }
}
