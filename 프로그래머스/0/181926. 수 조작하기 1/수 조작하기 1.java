class Solution {
    public int solution(int n, String control) {
        String[] arr = control.split("");
        for(String i : arr) {
            if(i.equals("w")) n++;
            else if(i.equals("s")) n--;
            else if(i.equals("d")) n += 10;
            else if(i.equals("a")) n -= 10;
        }
        return n;
    }
}