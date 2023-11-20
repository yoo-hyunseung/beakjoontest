import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long sum[] = new long[n+1];
        long rest[] = new long[m];
        long result = 0;
        st = new StringTokenizer(br.readLine());
        for(int i =1 ; i < n+1 ; i++){
            long num = Long.parseLong(st.nextToken());
            sum[i] = sum[i-1]+num;
            rest[(int)(sum[i]%m)]++;
        }
        result = rest[0];
        for(int i =0 ; i <m;i++){
            if(rest[i]>0){
                result += (rest[i]*(rest[i]-1))/2;
            }
        }
        System.out.println(result);
    }
}