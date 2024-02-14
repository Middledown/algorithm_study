class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] answer = new int[len];
        int count;
        for (int i = 0; i < len; i++) {
            count = 1;
            for (int j = 0; j < len; j++) {
                answer[i] = 1;
                if((score[i][0] + score[i][1]) < (score[j][0] + score[j][1])){
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}