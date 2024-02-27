class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a != b && b != c && a != c) {
            // 세 숫자가 모두 다를 때
            answer = a + b + c;
        } else if(a == b && b == c) {
            // 세 숫자가 모두 같을 때
            answer = (a + b + c) * (a * a + b * b + c * c) * (a*a*a + b*b*b + c*c*c);
        } else {
            // 어느 두 숫자는 같고 나머지 하나는 다를 때
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        
        return answer;
    }
}