import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int[] arr = new int[26];
        
        String STR = str.toUpperCase();
        
        for(int i = 0; i < STR.length(); i++) {
        	if ('A' <= STR.charAt(i) && STR.charAt(i) <= 'Z') {
    			arr[STR.charAt(i) - 'A']++;
    		}
        }
        int max = 0;
        char ch = 'A';
        		
        for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 'A');
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
        
        System.out.print(ch);
    }
}