import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) < 'a') {
                str += (a.charAt(i)+"").toLowerCase();
            } else {
                str += (a.charAt(i)+"").toUpperCase();             
            }
        }
        System.out.println(str);
        
    }
}