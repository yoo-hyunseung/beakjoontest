import java.io.*;
import java.util.*;

public class Main{
    static int [][] dp;
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp=new int[30][30];
        int t = Integer.parseInt(br.readLine());
        for(int i =0 ; i < t ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int result = combin(r,n);
            System.out.println(result);
        }
    }
    public static int combin(int n, int r){
        if(dp[n][r]>0)return dp[n][r];
        if (n==r || r==0){
            return 1;
        }
        return dp[n][r] = combin(n-1,r-1)+combin(n-1,r);
    }
}