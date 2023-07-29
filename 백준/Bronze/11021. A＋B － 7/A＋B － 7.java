import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum =0;
        int T = Integer.parseInt(br.readLine());
        for(int i =1 ; i <= T ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            System.out.println("Case #"+i+": "+sum);
        }
    }
}