class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int idx = 0;
        if(len % 2 != 0) {
            for(int i = 0; i < len; i += 2) {
                arr[i] = arr[i] + n;
                idx++;
            }
        } else {
            for(int i = 1; i < len; i += 2) {
                arr[i] = arr[i] + n;
                idx++;
            }
        }
        
        return arr;
    }
}