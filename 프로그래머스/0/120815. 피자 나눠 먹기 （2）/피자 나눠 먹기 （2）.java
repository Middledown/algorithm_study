class Solution {
    public int solution(int n) {
        int answer = 1;
        int pizza = 6;
        while(pizza % n != 0) {
            answer++;
            pizza += 6;
        }
        
        return answer;
    }
}