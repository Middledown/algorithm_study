import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[Math.round(array.length / 2)];
        return answer;
    }
}