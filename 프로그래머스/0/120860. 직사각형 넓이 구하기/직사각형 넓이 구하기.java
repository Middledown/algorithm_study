class Solution {
    public int solution(int[][] dots) {
        int wedMax = dots[0][0];
        int wedMin = dots[0][0];
        int heiMax = dots[0][1];
        int heiMin = dots[0][1];
        
        for(int i = 0; i < dots.length; i++) {
            wedMax = Math.max(wedMax, dots[i][0]);
            wedMin = Math.min(wedMin, dots[i][0]);
            heiMax = Math.max(heiMax, dots[i][1]);
            heiMin = Math.min(heiMin, dots[i][1]);
        }
        return (wedMax - wedMin) * (heiMax - heiMin);
    }
}