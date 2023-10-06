import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static Long [] dp = new Long [101];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        dp[0]=0L;
        dp[1]=1L;
        dp[2]=1L;
        dp[3]=1L;

        while(T-->0){
            
            sb.append(wave(Integer.parseInt(br.readLine()))).append('\n');
        }
        System.out.println(sb);
    }
    public static long wave(int n){
        if(dp[n]==null){
            dp[n] = wave(n-3)+ wave(n-2);
        }
        return dp[n];
    }
}