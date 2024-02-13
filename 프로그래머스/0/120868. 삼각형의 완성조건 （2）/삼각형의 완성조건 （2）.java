class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 가장 긴 변이 sides 중 하나일 경우
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] > sides[1] ? sides[1] : sides[0];
        for(int i = 1; i < max + min; i++) {
            if(max < min + i) {
                answer++;
            }   
        }
        
        
        // 나머지 한 변이 가장 긴 변인 경우
        
        return answer;
    }
}