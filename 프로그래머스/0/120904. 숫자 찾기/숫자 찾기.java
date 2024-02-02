class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        String[] arr = str.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(Integer.parseInt(arr[i]) == k) {
                answer = i + 1;
                break;
            }
        }
        return answer == 0 ? -1 : answer;
    }
}