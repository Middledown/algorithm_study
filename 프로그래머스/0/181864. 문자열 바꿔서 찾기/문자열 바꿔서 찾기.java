class Solution {
    public int solution(String myString, String pat) {
        String[] arr = myString.split("");
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("A")) {
                str += "B";
            } else {
                str += "A";
            }
        }       
        return str.contains(pat) ? 1 : 0;
    }
}