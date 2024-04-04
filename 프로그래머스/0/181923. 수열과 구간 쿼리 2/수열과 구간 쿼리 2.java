import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int[] arr1 = new int[queries.length];
        Arrays.fill(arr1, Integer.MAX_VALUE);

        for(int i = 0; i < queries.length; i++) { 
            for (int j = queries[i][0]; j <= queries[i][1]; j++){ 
                if( arr[j] > queries[i][2]) {
                    if(arr1[i] > arr[j]) {
                        arr1[i] = arr[j];
                    }
                }
            }
            if(arr1[i] == Integer.MAX_VALUE) {
                arr1[i] = -1;
            }
        }
        return arr1;
    }
}