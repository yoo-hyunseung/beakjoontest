import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = Factorial(n);
        System.out.println(result);
    }
    public static long Factorial(int n){
        if(n <=1){
            return 1;
        }
        else return n*Factorial(n-1);
    }
}