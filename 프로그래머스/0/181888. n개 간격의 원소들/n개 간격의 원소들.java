class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int count = 0;
        for(int i = 0; i < num_list.length; i += n) {
            count++;
        }
        int[] answer = new int[count];
        int idx = 0;
        for(int i = 0; i < num_list.length; i += n) {
            answer[idx] = num_list[i];
            idx++;
        }
        
        return answer;
    }
}