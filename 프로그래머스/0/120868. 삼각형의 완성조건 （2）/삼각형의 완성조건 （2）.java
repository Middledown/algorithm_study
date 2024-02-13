class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        for(int i = 1; i < max + min; i++) {
            if(max < min + i) {
                answer++;
            }   
        }
        
        return answer;
    }
}