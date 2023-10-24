import java.util.*;
import java.io.*;

public class Main{
    static int [] seq;
    static Integer dp[];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        seq = new int[n];
        dp = new Integer[n];
        for(int i =0 ; i<n ; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }
        for(int i =0 ; i<n;i++){
            lds(i);
        }
        int max = dp[0];
        for(int i=0 ; i<n ;i++){
            if(max<dp[i])max=dp[i];
        }
        System.out.println(max);
    }
    public static int lds(int n){
        if(dp[n] == null){
            dp[n] = 1;
            for(int i =n+1 ; i<dp.length; i++){
                if(seq[i]<seq[n]){
                    dp[n] = Math.max(dp[n],lds(i)+1);
                }
            }
        }
        return dp[n];
    }
}