import java.util.*;

class Solution {
    public ArrayList<String> solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < answer.length; i++) {
            if(!answer[i].equals("")) {
                list.add(answer[i]);
            }
        }
        if(list.size() == 0) {
            list.add("EMPTY");
        }
        return list;
    }
}