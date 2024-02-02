class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++) {
            if(rsp.charAt(i) - '0' == 5) {
                answer += "2";
            } else if (rsp.charAt(i) - '0' == 2) {
                answer += "0";
            } else {
                answer += "5";
            }
        }
        return answer;
    }
}