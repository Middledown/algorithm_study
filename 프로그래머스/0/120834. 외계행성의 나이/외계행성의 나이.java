import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String strAge = String.valueOf(age);
        String[] strArr = strAge.split("");
            
        for(int i = 0; i < strArr.length; i++) {
            answer += (char)(Integer.parseInt(strArr[i]) + 97);
        }
        
        return answer;
    }
}