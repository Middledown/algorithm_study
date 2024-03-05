class Solution {
    public String solution(String myString, String pat) {
        int index = myString.indexOf(pat);
        while(index != -1) {
            if(myString.indexOf(pat, index + pat.length()) == -1) break;
            index = myString.indexOf(pat, index + pat.length());
        }
        
        return myString.substring(0, index + pat.length());
    }
}