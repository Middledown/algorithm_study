class Solution {
    public int solution(int n, int k) {
        int yang = n;
        while(n >= 10 && k != 0) {
            n -= 10;
            k -= 1;
        }
        return yang * 12000 + k * 2000;
    }
}