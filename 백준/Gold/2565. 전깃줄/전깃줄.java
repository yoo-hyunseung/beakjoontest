import java.util.*;
import java.io.*;

public class Main{
    static int [][]arr;
    static Integer dp[];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int [n][2];
        dp = new Integer[n];
        StringTokenizer st;
        for(int i =0 ; i<n ;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = a;
            arr[i][1] = b;
        }
        Arrays.sort(arr, (e1,e2)->{
            return e1[0]-e2[0];
        });
        for(int i =0 ; i < n ;i++){
            LIS(i);
        }
        int max=0;
        for(int i =0 ; i<n ; i++){
            if(max<dp[i])max=dp[i];
        }
        System.out.println(n-max);
    }
    public static int LIS(int n){
        if(dp[n]==null){
            dp[n] = 1;
            for(int i = n+1;i<arr.length;i++){
                if(arr[n][1]<arr[i][1]){
                    dp[n] = Math.max(dp[n],LIS(i)+1);
                }
            }
        }
        return dp[n];
    }
}