import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long start = 0;
        long end = n;
        long result =0;
        while(start <= end){
            long mid = (start+end)/2;
            if((Math.pow(mid,2))>=n){
                end = mid-1;
                result = mid;
            }
            else {
                start = mid+1;
            }
        }
        System.out.println(result);
    }
}