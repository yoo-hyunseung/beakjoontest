import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        HashSet <Integer> set = new HashSet<>(n);
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0 ; i < n ; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0 ; i< m ; i++){
            if(set.contains(Integer.parseInt(st.nextToken())))
                sb.append(1).append(" ");
            else
                sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
}