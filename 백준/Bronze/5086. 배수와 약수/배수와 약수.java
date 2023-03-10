import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(n == 0 && m == 0){
                break;
            }
            else{
                if(m % n == 0){
                    sb.append("factor").append("\n");
                }
                else if(n % m == 0){
                    sb.append("multiple").append("\n");
                }
                else{
                    sb.append("neither").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}