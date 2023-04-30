import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T ; i++){
            int p = Integer.parseInt(br.readLine());
            sb.append(p/25).append(" ");
            p%=25;
            sb.append(p/10).append(" ");
            p%=10;
            sb.append(p/5).append(" ");
            p%=5;
            sb.append(p).append('\n');       
        }
        System.out.println(sb);
    }
}