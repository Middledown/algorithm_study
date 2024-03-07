import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> idx = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                idx.add(i);        
            }    
        }
        
        if(idx.size() == 0) {
            list.add(-1);
        } else {
            for(int i = idx.get(0); i <= idx.get(idx.size() - 1); i++) {
                list.add(arr[i]);
            }
        }
        
        return list;
    }
}