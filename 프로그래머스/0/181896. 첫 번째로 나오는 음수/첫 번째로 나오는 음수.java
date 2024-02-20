class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        for(int i = 0; i < num_list.length; i++) {
            if(0 > num_list[i]) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}