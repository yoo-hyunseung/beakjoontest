import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int minP = Integer.MAX_VALUE;
        int minL = Integer.MAX_VALUE;
        int result =Integer.MAX_VALUE;
        for(int i = 0 ; i< M ;i++){
            st = new StringTokenizer(br.readLine()," ");
            int P = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            if(minP > P)
                minP = P;
            if(minL > L)
                minL = L;
        }
        result = Math.min(minL*N , ((N/6)+1)*minP);
        result = Math.min(result , ((N/6)*minP)+(N%6)*minL );
        System.out.println(result);
    }
}