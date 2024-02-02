class Solution {
    public int[] solution(int n, int[] numlist) {
        // 배열 길이 구하기
        int count = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                count++;
            }    
        }
        
        int[] answer = new int[count];
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[answer.length - count] = numlist[i];
                count--;
            }
        }
        System.out.println(answer.length);
        return answer;
    }
}