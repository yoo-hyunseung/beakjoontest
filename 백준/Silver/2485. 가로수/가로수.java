import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[]tree = new int[n];
        for(int i =0 ;i < n ; i++){
            tree[i] = Integer.parseInt(br.readLine());
        }
        int g = 0;
        for(int i =0 ; i < n-1 ; i++){
            int d = tree[i+1] - tree[i]; 
            g = gcd(d,g);
        }
        int result = (int)((tree[n-1]-tree[0])/g)-n+1;
        System.out.println(result);
    }
    public static int gcd(int a, int b){
        if(b==0)return a;
        else{
            return gcd(b,a%b);
        }
    }
}