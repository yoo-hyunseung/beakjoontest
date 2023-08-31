import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sec = Integer.parseInt(br.readLine());
        int A = 300;
        int B = 60;
        int C = 10;
        int result = -1;
        if(sec%10 == 0){
            while(sec >0){
                sb.append(sec/A+" ");
                sec %=A;
                sb.append(sec/B+" ");
                sec%=B;
                sb.append(sec/C);
                sec%=C;
            }
        }
        else sb.append(result);
        System.out.println(sb);
    }
}