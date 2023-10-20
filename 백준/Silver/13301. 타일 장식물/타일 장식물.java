import java.util.*;
import java.io.*;

public class Main{
    static long dp[] = new long[81];
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 1;
        for(int i =3 ; i <=n ;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        long result = (2*dp[n])+(2*(dp[n-1]+dp[n]));
        System.out.println(result);
    }
}