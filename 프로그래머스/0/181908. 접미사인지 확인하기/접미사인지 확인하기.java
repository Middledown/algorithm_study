class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String str = "";
        if(my_string.length() == is_suffix.length()) {
            if(my_string.equals(is_suffix)) {
                answer = 1;
            }
        } else if(my_string.length() > is_suffix.length()) {
            str = my_string.substring(my_string.length() - is_suffix.length());
            if(str.equals(is_suffix)) {
                answer = 1;
            }
        } else {
            answer = 0;
        }
        
        return answer;
    }
}