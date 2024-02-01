class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] qqq = str.split("");
        for(int i = 0; i < qqq.length; i++) {
            answer += Integer.parseInt(qqq[i]);
        }
        return answer;
    }
}