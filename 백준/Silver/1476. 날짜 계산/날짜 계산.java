import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken())-1;
        int S = Integer.parseInt(st.nextToken())-1;
        int M = Integer.parseInt(st.nextToken())-1;
        int e = 0;
        int s = 0;
        int m = 0;
        int year = 1;
        while(!(e==E && s==S && m==M)){
            e=(e+1)%15;
            s=(s+1)%28;
            m=(m+1)%19;
            year++;
        }
        System.out.println(year);
    }
}