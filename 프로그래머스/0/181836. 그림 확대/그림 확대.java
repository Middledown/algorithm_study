import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i < picture.length; i++) {
            String[] arr = picture[i].split("");
            String str = "";
            for(int j = 0; j < arr.length; j++) {
                str += arr[j].repeat(k);
            }
            for(int j = 0; j < k; j++) {
                list.add(str);   
            }
        }
        return list.toArray(new String[list.size()]);
    }
}