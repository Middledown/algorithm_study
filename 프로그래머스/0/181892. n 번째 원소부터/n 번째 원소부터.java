class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len - n + 1];

        for (int i = 0; i < len - n + 1; i++) {
            answer[i] = num_list[n + i - 1];     
        }

        return answer;
    }
}