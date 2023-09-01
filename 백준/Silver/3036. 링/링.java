import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
       
        int n = Integer.parseInt(br.readLine());
        int []arr = new int [n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ;i< n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=1; i<n;i++){
            int t = gcd(arr[0],arr[i]);
            sb.append(arr[0]/t).append("/").append(arr[i]/t).append('\n');
        }
        System.out.println(sb);
    }
    public static int gcd(int a, int b){
        if(b == 0) return a; 
        return gcd(b, a % b);      
    }
}