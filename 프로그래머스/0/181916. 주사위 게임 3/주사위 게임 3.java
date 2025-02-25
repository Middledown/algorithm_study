import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int list[] = {a,b,c,d};
        
        Arrays.sort(list);
        
        if(list[0] == list[3]) {                                
            // 4개가 같은 경우
            return 1111 * list[0];
        } else if(list[0] == list[2]) {                         
            // 3개가 같은 경우
            return (int)Math.pow((10 * list[0] + list[3]), 2);
        } else if(list[1] == list[3]) {                         
            // 3개가 같은 경우
            return (int)Math.pow((10 * list[1] + list[0]), 2);
        } else if(list[0] == list[1] && list[2] == list[3]) {                         
            // 2개가 같은 경우
            return (list[0] + list[2]) * Math.abs(list[0] - list[2]);
        } else if(list[0] == list[1] || list[1] == list[2] || list[2] == list[3]) { 
            //두 개만 같고, 나머지는 각각 다를 경우 
            if(list[0] == list[1]) {
                return list[2]*list[3];
            } else if(list[1] == list[2]) {
                return list[0]*list[3];
            } else {
                return list[0]*list[1];
            }
        } else {                                                
            // 다 다른 경우
            return list[0];
        }
    }
}