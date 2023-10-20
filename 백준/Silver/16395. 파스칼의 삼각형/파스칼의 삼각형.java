import java.util.*;
import java.io.*;

public class Main{
    static int[][] dp = new int[31][31];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 2;
        dp[3][3] = 1;
        int result = Pascal(n,k);
        System.out.println(dp[n][k]);
    }
    public static int Pascal(int n,int k){
        if(dp[n][k]!=0){
            return dp[n][k];
        }
        if(k==1 || n==k){
            return dp[n][k] = 1;
        }
        return dp[n][k] = Pascal(n-1,k-1) + Pascal(n-1,k);
    }
}