class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n <= 7) {
            answer++;
        } else {
            while(n > 7) {
                    n = n - 7;
                    answer++;    
                if(n <= 7) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}