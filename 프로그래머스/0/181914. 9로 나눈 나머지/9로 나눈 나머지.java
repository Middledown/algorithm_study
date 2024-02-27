class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] arr = number.split("");
        for(int i = 0; i < number.length(); i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer % 9;
    }
}