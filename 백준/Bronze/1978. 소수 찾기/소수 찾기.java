import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count =0;
        while(st.hasMoreTokens()){
            if(isPrime(Integer.parseInt(st.nextToken()))){
                count++;
            }
        }
        System.out.println(count);
        
    }
    public static boolean isPrime(int n){
        if(n==1)return false;
        for(int i = 2 ; i <=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
}