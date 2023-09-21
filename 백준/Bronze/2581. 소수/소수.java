import java.util.*;
import java.io.*;

public class Main{
    static boolean prime [];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        prime = new boolean [n+1];
        prime[0] = prime[1] = true;
        isPrime(n);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i =m ; i<prime.length;i++){
            if(i<min && !prime[i]){
                min=i;
            }
            if(!prime[i]){
                sum+=i;
            }
        }
        if(sum==0){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
    public static void isPrime(int n){
        if(n<2)return;
        for(int i =2 ; i <=Math.sqrt(n);i++){
            if(prime[i]){
                continue;
            }
            for(int j = i*i;j<prime.length;j+=i){
                prime[j]=true;
            }
        }
    }
}