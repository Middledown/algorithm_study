class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(alp)) {
                answer += arr[i].toUpperCase();
            } else {
                answer += arr[i];
            }
        }
        return answer;
    }
}