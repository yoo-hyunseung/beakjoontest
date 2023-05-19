import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        HashMap <String,Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine()," ");
        for(int i =0 ; i < n ; i++){
            String key = st.nextToken();
            if(map.containsKey(key)){
                int v = map.get(key);
                map.put(key, v+1);
            }
            else{
                map.put(key, 1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0 ; i<m ;i++){
            String k = st.nextToken();
            if(map.containsKey(k)){
                sb.append(map.get(k)).append(" ");
            }
            else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}