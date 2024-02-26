import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer.add(arr[i]);
        }
        for(int j = intervals[1][0]; j <= intervals[1][1]; j++) {
            answer.add(arr[j]);
        }
        return answer;
    }
}