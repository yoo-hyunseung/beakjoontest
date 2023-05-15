import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0){
                break;
            }
            int total = a+b+c;
            int max = Math.max(Math.max(a,b),c);
            if(max >= (total-max)){
                sb.append("Invalid").append("\n");
                continue;
            }
            if(a == b){
                if(b==c){
                    sb.append("Equilateral").append("\n");
                }
                else{
                    sb.append("Isosceles").append("\n");
                }
            }
            else if(b == c){
                if(c==a){
                    sb.append("Equilateral").append("\n");
                }
                else{
                    sb.append("Isosceles").append("\n");
                }
            }
            else if(c == a){
                if(a == b){
                    sb.append("Equilateral").append("\n");
                }
                else{
                    sb.append("Isosceles").append("\n");
                }
            }
            else {
                sb.append("Scalene").append("\n");
            }
            
        }
        System.out.println(sb);
    }
}