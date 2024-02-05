import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
		int answer = 1;
		int len = str.length();
		
		for (int i = 0; i < len / 2; i++) {
			if(str.charAt(i) != str.charAt(len - i - 1)) {
				answer = 0;
				break;
			}
		}
		
		System.out.println(answer);
    }
}