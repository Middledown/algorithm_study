import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(n);
        while(n != 1) {
            if(n % 2 == 0) {
                n /= 2;
                num.add(n);
            } else {
                n = 3 * n + 1;    
                num.add(n);
            }
        }
        
        return num;
    }
}