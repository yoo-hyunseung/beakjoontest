import java.io.*;
import java.util.*;

public class Main{
    static boolean[] prime;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0){
            int count =0;
            int num = Integer.parseInt(br.readLine());
            isPrime(num);
            for(int i = 2 ; i < num ; i++){
                int num2 = num-i;
                if((!prime[i])&&(!prime[num2])){
                    count++;
                    prime[i] = true;
                    prime[num2] = true;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
    public static void isPrime(int num){
        prime = new boolean[num+1];
        prime[0] = prime[1] = true;
        for(int i = 2; i <= Math.sqrt(num);i++){
            if(prime[i]==true)continue;
            for(int j = i*i ; j < prime.length;j=j+i){
                prime[j] = true;
            }
        }
    }
}