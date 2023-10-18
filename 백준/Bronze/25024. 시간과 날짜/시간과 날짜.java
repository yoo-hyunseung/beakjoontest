import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if((x>=0 && x<=23) && (y>=0 && y<=59)){
                sb.append("Yes ");
            } else{
                sb.append("No ");
            }
            if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12){
                if(y>=1 && y<=31){
                    sb.append("Yes");
                } else{
                    sb.append("No");
                }
            } else if(x==4 || x==6 || x==9 || x==11){
                if(y>=1 && y<=30){
                    sb.append("Yes");
                } else{
                    sb.append("No");
                }
            }
            else if(x==2){
                if(y>=1 && y<=29){
                    sb.append("Yes");
                } else{
                    sb.append("No");
                }
            } else{
                sb.append("No");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}