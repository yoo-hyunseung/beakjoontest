import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long gcd = GCD(A,B);
        long result = A*B/gcd;
        System.out.println(result);
    }
    static long GCD(long a, long b){
        if(b == 0){
        return a;
        }
        else{
        return GCD(b, a%b);
        }
    }
}