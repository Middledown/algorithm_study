class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] arr = num_str.split("");
        for (String i : arr) {
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}