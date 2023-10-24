import java.io.*;
import java.util.*;

public class Main{
    static Integer lis[];
    static Integer lds[];
    static int seq[];
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        lis = new Integer[n];
        lds = new Integer[n];

        seq = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0 ; i < n ; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }
        for(int i =0 ; i <n ;i++){
            LIS(i);
            LDS(i);
        }
        int result =0;
        for(int i =0 ; i<n ;i++){
            int sum = lis[i]+lds[i];
            if(result < sum){
                result = sum;
            }
        }
        System.out.println(result-1);
        
    }
    public static int LIS(int n){
        if(lis[n]==null){
            lis[n] = 1;
            for(int i =n-1;i>=0 ; i--){
                if(seq[i]<seq[n]){
                    lis[n] = Math.max(lis[n],LIS(i)+1);
                }
            }
        }
        return lis[n];
    }
    
    public static int LDS(int n){
        if(lds[n]==null){
            lds[n]=1;
            for(int i = n+1;i<lds.length;i++){
                if(seq[n]>seq[i]){
                    lds[n] = Math.max(lds[n],LDS(i)+1);
                }
            }
        }
        return lds[n];
    }
}