import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder newString = new StringBuilder(my_string);

        for(int num : indices) {
            newString.setCharAt(num, ' ');    
        }
        
        return newString.toString().replaceAll(" ", "");
    }
}