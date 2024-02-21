import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String str1 = "@".repeat(N) + " ".repeat(N * 3) + "@".repeat(N) + "\n";
        String str2 = "@@@@@".repeat(N) + "\n";
        System.out.print(str1.repeat(N));
        System.out.print(str2.repeat(N));
        System.out.print(str1.repeat(N));
        System.out.print(str2.repeat(N));
        System.out.print(str1.repeat(N));
    }
}