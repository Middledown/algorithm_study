import java.math.*;

class Solution {
    public int solution(int n, int m) {
        BigInteger facN = new BigInteger("1");
        BigInteger facNM = new BigInteger("1");
        
        for(int i = n; i > m; i--) {
            facN = facN.multiply(BigInteger.valueOf(i));
        }
        for(int i = n - m; i > 1; i--) {
            facNM = facNM.multiply(BigInteger.valueOf(i));
        }
        
        int answer = (facN.divide(facNM)).intValue();
        return answer;
    }
}