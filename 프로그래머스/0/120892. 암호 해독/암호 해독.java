class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = 1; i <= cipher.length(); i++) {
            if(i % code == 0) {
                answer += Character.toString(cipher.charAt(i - 1));
            }
        }
        return answer;
    }
}