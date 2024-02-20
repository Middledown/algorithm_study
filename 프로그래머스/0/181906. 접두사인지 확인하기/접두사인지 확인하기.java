class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str = "";
        if(my_string.length() == is_prefix.length()) {
            answer = my_string.equals(is_prefix) ? 1 : 0;
        } else if(my_string.length() < is_prefix.length()) {
            answer = 0;
        } else {
            str = my_string.substring(0, is_prefix.length());    
            answer = str.equals(is_prefix) ? 1 : 0;
        }
        
        return answer;
    }
}