import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int total = a+b+c;
        int max = Math.max(Math.max(a,b),c);
        if(max < (total-max)){
            System.out.println(total);
        }
        else{
            int other = total-max;
            while(max >= other){
                max -=1;
            }
            System.out.println(other+max);
        }
    }
}