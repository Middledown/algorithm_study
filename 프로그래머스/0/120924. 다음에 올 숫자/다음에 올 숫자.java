class Solution {
    public int solution(int[] common) {
        int answer = 0;
        for(int i = 0; i < common.length - 2; i++) {
            int x = common[i + 1] - common[i];
            int y = common[i + 2] - common[i + 1];
            if(x == y) {
                answer = common[common.length - 1] + x;
            } else {
                answer = common[common.length - 1] * (y / x);   
            }
        }
        return answer;
    }
}