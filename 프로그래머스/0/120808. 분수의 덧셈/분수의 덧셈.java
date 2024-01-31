class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer = 0;
        int denom = 0;
        if(denom1 == denom2) {
            numer = numer1 + numer2;
            denom = denom1;
        } else {
            numer = numer1 * denom2 + numer2 * denom1;
            denom = denom1 * denom2;    
        }
        int max = 0;
        
        for(int i = 1; i <= denom && i <= numer; i++) {
            if(numer % i == 0 && denom % i == 0) {
                max = i;
            }
        }
        answer[0] = numer / max;
        answer[1] = denom / max;
        
        return answer;
    }
}