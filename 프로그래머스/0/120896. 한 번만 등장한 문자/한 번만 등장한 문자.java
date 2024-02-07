import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        int count = 0;
        
        
        for(int i = 0; i < arr.length; i++) {
            count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if(count == 1) {
                    answer += arr[i];
            }
        }

        return answer;
    }
}