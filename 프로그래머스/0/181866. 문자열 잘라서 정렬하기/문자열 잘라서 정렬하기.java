import java.util.*;

class Solution {
    public ArrayList<String> solution(String myString) {
        
        ArrayList<String> answer = new ArrayList<>();
        String[] arr = myString.split("x");

        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].isEmpty()) {
                answer.add(arr[i]);
            }
        }
        
        Collections.sort(answer);
        
        return answer;
    }
}