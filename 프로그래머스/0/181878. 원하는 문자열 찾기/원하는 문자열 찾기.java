class Solution {
    public int solution(String myString, String pat) {
        String a = myString.toLowerCase();
        String b = pat.toLowerCase();
        
        return a.contains(b) ? 1 : 0;
    }
}