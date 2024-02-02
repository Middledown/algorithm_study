class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            int myChar = my_string.charAt(i);
            if(65 <= myChar && myChar <= 90) {
                answer += Character.toString(myChar + (char)32);
            } else {
                answer += Character.toString(myChar - (char)32);
            }
        }
        return answer;
    }
}