class Solution {
    public int[] solution(String str) {
        int[] answer = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a') {
                answer[str.charAt(i) - 71]++;    
            } else {
                answer[str.charAt(i) - 65]++;
            }
        }
        return answer;
    }
}