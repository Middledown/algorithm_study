class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int num = 1;
        
        while(num < len) {
            num *= 2;
        }
        
        if(len == num) return arr;
        else {
            int[] answer = new int[num];
            for(int i = 0; i < len; i++) {
                answer[i] = arr[i];
            }
            return answer;
        }
    }
}