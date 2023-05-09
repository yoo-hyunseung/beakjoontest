import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_sub = new StringTokenizer(br.readLine(), "-");
        int sum = Integer.MAX_VALUE;
        while(st_sub.hasMoreTokens()){
            int temp =0;
            StringTokenizer st_add = new StringTokenizer(st_sub.nextToken(),"+");
            while(st_add.hasMoreTokens()){
                temp += Integer.parseInt(st_add.nextToken());
            }
            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }
            else
                sum-=temp;
        }
        System.out.println(sum);
    }
}