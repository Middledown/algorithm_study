class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 3; i <= n; i++) {
            int qqq = 0;
            for(int j = 1; j <= n; j++) {
                if(i % j == 0) {
                    qqq++;
                }
            }
            if(Math.sqrt(i) % 1 == 0) {
                answer++;
            } else if(qqq >= 3) {
                answer++;                
            }
        }
        
        return answer;
    }
}