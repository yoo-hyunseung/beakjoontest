import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int []coin = new int[n];
        int coin_cnt =0;
        for(int i = 0 ; i < n; i ++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        for(int i = n-1; i >=0; i--){
            if(coin[i]<=k){
                coin_cnt += k/coin[i];
                k = k%coin[i];
            }
        }
        System.out.println(coin_cnt);
    }
    
}