import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0;
        for(int i = 0; i < arr.length; i++) {
            if(flag[num]) {
                for(int j = 0; j < arr[num]; j++) {
                    list.add(arr[num]);
                    list.add(arr[num]);
                }
            } else {
                for(int j = 0; j < arr[num]; j++) {
                    list.remove(list.size() - 1);
                }
            }
            num++;
        }
        return list;
    }
}