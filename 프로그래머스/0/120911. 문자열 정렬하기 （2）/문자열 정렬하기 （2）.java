import java.util.*;

class Solution {
    public String solution(String my_string) {
        String strLower = my_string.toLowerCase();
        String[] str = strLower.split("");
        Arrays.sort(str);
        return String.join("", str);
    }
}