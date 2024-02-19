class Solution {
    public String[] solution(String[] strArr) {
        int len = strArr.length;
        String[] answer = new String[len];
        answer[0] = strArr[0].toLowerCase();
        for(int i = 1; i < len; i++) {
            if(i % 2 != 0) {
                answer[i] = strArr[i].toUpperCase();
            } else {
                answer[i] = strArr[i].toLowerCase();      
            }
        }
        return answer;
    }
}