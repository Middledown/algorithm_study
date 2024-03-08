class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int alen = arr.length;
        int qlen = queries.length;
        
        for(int i = 0; i < alen; i++) {
            for(int j = 0; j < qlen; j++) {
                if(i <= queries[j % qlen][1] && i >= queries[j % qlen][0] && i % queries[j % qlen][2] == 0) {
                    arr[i]++;
                }
            }
        }
        
        return arr;
    }
}