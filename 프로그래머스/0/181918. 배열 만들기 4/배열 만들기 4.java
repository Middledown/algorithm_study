import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk= new ArrayList();
        
        int i=0;
        while(i<arr.length){
            
            if(stk.size()==0){
                stk.add(arr[i]);
                i=i+1;
            }
            else{
                int last=stk.get(stk.size()-1);
                if(stk.size()!=0 && last<arr[i]){
                stk.add(arr[i]);
                i=i+1;
                }
                else if(stk.size()!=0 && last>=arr[i]){
                    stk.remove(stk.size()-1);
                }
            }
            
        }

        return stk;
    }
}