class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);
        
        String[] orderArr = orderStr.split("");
        
        for(int i = 0; i < orderArr.length; i++) {
            int num = Integer.parseInt(orderArr[i]);
            if(num % 9 == 0 && num != 0) answer++;
            else if (num % 6 == 0 && num != 0) answer++;
            else if (num % 3 == 0 && num != 0) answer++;
        }
        
        
        return answer;
    }
}