import java.util.*;
import java.io.*;

public class Main{
    static int n;
    static int dp[];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i =0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp = new int [n];
        Arrays.fill(dp,1);
        int result = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j =0; j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            result = Math.max(result,dp[i]);
        }
        System.out.println(result);
    }
}