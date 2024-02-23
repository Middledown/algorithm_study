class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] arr = myString.split("");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("a") || arr[i].equals("A")) {
                answer += arr[i].toUpperCase();
            } else {
                answer += arr[i].toLowerCase();
            }
        }
        
        return answer;
    }
}