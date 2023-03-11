import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        int a3 = a1*b2+a2*b1;
        int b3 = b1*b2;
        
        int result = GCD(b3,a3);
        System.out.println(a3/result + " "+ b3/result);
    }
    static int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return GCD(b, a%b);
        }
    }
}