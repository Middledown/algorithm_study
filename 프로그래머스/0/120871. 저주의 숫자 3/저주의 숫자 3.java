class Solution {
    public int solution(int n) {
        int answer = n;
        for(int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                answer++;
                n++;
            } else if ((i + "").contains("3")) {
                answer++;
                n++;
            }
        }
        return answer;
    }
}