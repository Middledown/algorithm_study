import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        for(int i = start_num; i <= end_num; i++) {
            arrayList.add(i);
        }
        
        int[] answer = new int[arrayList.size()];
        
        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = arrayList.get(i).intValue();
        }
        return answer;
    }
}