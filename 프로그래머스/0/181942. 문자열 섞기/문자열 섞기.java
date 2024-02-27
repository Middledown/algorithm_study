class Solution {
    public String solution(String str1, String str2) {
        String answer = str1.charAt(0) + "";
        for(int i = 1; i < str1.length() * 2; i++) {
            if(i % 2 == 0) {
                answer += str1.charAt(i / 2);
            } else {
                answer += str2.charAt(i / 2);
            }
        }
        return answer;
    }
}