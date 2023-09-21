import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int days;
        v-=a;
        days = v/(a-b);
        if(v%(a-b) == 0){
            System.out.println(days+1);
        } else{
            System.out.println(days+2);
        }
    }
}