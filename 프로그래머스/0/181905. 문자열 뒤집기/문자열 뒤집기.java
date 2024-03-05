class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String target = my_string.substring(s, e + 1);
        StringBuffer sb = new StringBuffer(target);        
        String reverse = sb.reverse().toString();
        return my_string.substring(0, s) + reverse + my_string.substring(e + 1);
    }
}