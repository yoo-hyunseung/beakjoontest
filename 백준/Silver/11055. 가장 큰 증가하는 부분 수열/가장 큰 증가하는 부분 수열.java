import java.io.*;
import java.util.*;

public class Main{
    static Integer[] dp;
    static int []seq;
    static int MAX=0;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n];
        seq = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0 ; i<n;i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }
        for(int i =0 ; i< n ;i++){
            // func()
            LIS(i);
        }
        int max = 0;
        for(int i =0 ; i<n;i++){
            if(max<dp[i]){
                max =dp[i];
            }
        }
        System.out.println(max);
    }
    public static int LIS(int n){
        if(dp[n]==null){
            dp[n] = seq[n];
            for(int i = n-1; i>=0;i--){
                if(seq[i]<seq[n]){
                    dp[n] = Math.max(dp[n],LIS(i)+seq[n]);
                }
            }
        }
        return dp[n];
    }
}