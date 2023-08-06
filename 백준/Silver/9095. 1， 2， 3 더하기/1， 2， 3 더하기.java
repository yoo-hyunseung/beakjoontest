import java.io.*;
import java.util.*;

public class Main{
    static int arr[] = new int[11];
    static int n;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        while(T-- > 0){
            n = Integer.parseInt(br.readLine());
            sb.append(dp(n)).append('\n');
        }
        System.out.println(sb);
    }
    static int dp(int num){
        if(num <= 3){
            return arr[num];
        }     
        else{
            return arr[num] = dp(num-2) + dp(num-1)+dp(num-3);
        }
    }
}