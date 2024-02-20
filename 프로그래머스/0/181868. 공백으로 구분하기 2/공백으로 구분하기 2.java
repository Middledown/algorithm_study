class Solution {
    public String[] solution(String my_string) {

        String[] arr = my_string.split(" ");
        
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("")) {
                idx++;
            }
        }
        
        String[] answer = new String[idx];
        idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("")) {
                answer[idx] = arr[i];
                idx++;
            }
        }
            
        return answer;
    }
}