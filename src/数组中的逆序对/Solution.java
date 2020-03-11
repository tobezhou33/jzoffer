package 数组中的逆序对;

public class Solution {
    int cnt = 0;

    public int InversePairs(int [] array) {
        if(array.length == 0)return 0;
        Merge(array, 0, array.length - 1);
        return cnt;
    }
    public void Merge(int[] array, int start, int end){
        if(start >=end)return ;
        int mid = start + (end-start)/2;
        Merge(array, start, mid);
        Merge(array, mid+1, end);

        Merge2(array, start, mid, end);
    }
    public void Merge2(int[] a, int start, int mid, int end){
        int[] temp = new int[end -start + 1];
        int i = start, j = mid + 1, k = 0;
        while(i <=mid && j <=end){
            if(a[i] <= a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
                cnt = (cnt + mid-i+1)%1000000007;
            }
        }
        while(i <= mid){
            temp[k++]= a[i++];
        }
        while(j <= end){
            temp[k++] = a[j++];
        }
        for(int p = 0; p<temp.length; p++){
            a[start + p]= temp[p];
        }

    }
}
