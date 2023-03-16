import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  
        System.out.println(search(n));
    }
    public static int search(int n){
        for(int i = 1; i < n ; i++){
            int sum = 0;
            int k = i;
            while(k!=0){
                sum += k%10;
                k/=10;
            }
            if(sum+i == n)
                return i;
        }
        return 0;
    }
}