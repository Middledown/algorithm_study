class Solution {
    public int[] solution(int money) { 
        int qqq = 0;
        while(money >= 5500) {
            money -= 5500;
            qqq++;
        }
        int[] answer = {qqq, money};
        return answer;
    }
}