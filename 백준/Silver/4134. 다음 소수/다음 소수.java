import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        long T = Long.parseLong(br.readLine());
        while(T-->0){
            long n = Long.parseLong(br.readLine());
            sb.append(findPrime(n)).append("\n");
        }
        System.out.println(sb);
    }
    public static long findPrime(long n){
        while(true){
            if(n<=2){
                return 2l;
            }
            if(isPrime(n)){
                return n;
            }
            n++;
        }
    }
    public static boolean isPrime(long n){
        for(long i =2; i <= Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
}