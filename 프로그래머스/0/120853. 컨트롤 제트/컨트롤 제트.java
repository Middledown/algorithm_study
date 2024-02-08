class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        int num = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Z")) {
                answer -= num;
            } else {
                num = Integer.parseInt(arr[i]);
                answer += num;
            }
        }
        return answer;
    }
}