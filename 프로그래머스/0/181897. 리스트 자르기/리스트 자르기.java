import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        if(n == 4){   
            int size = (slicer[1] - slicer[0]) / slicer[2] + 1;      
            answer = new int[size];
            
            for (int i = 0; i < size; i++) {
                answer[i] = num_list[slicer[0] + i * slicer[2]];
            }
            
        } else if(n == 3){
            answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
        } else if(n == 2){
            answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length );
        } else {
            answer = Arrays.copyOfRange(num_list, 0, slicer[1]+1);  
        }
        
        return answer;
    }
}