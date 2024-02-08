import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                n /= i;
                if(!answer.contains(i)) {
                    answer.add(i);
                }
            }       
        }
        
        return answer;
    }
}