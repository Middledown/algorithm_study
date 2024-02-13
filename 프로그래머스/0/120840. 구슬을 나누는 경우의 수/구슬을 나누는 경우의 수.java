import java.math.*;

class Solution {
    public int solution(int n, int m) {
        BigInteger facN = new BigInteger("1");
        BigInteger facM = new BigInteger("1");
        BigInteger facNM = new BigInteger("1");
        
        for(int i = n; i > 1; i--) {
            facN = facN.multiply(BigInteger.valueOf(i));
        }
        for(int i = m; i > 1; i--) {
            facM = facM.multiply(BigInteger.valueOf(i));
        }
        for(int i = n - m; i > 1; i--) {
            facNM = facNM.multiply(BigInteger.valueOf(i));
        }
        int answer = (facN.divide(facNM.multiply(facM))).intValue();
        return answer;
    }
}