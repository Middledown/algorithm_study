import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        int[] arr = emergency.clone();
        Arrays.sort(arr);
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(emergency[j] == arr[i]) {
                    answer[j] = len - i;
                }
            }
        }
         return answer;
    } 
}