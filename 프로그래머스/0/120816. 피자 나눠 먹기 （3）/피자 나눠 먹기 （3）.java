class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int num = slice;
        while(true) {
            if(n > num) {
                num += slice;
                answer++;
            } else {
                break;
            }    
        }
        
        return answer;
    }
}