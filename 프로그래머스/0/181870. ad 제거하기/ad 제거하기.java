class Solution {
    public String[] solution(String[] strArr) {
        String str = "";
        for(String i : strArr) {
            if(!i.contains("ad")) {
                str += i + " ";
            }
        }
        return str.split(" ");
    }
}