import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int n =Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap <String, String>map1 = new HashMap<>();
        HashMap <String, String>map2 = new HashMap<>();
        for(int i=0 ; i < n ; i++){
            String str = br.readLine();
            map1.put (String.valueOf(i+1),str);
            map2.put(str, String.valueOf(i+1));
        }
        for(int i = 0 ; i< m;i++){
            String p = br.readLine();
            if(map1.get(p) == null)
                sb.append(map2.get(p)).append('\n');
            else
                sb.append(map1.get(p)).append('\n');
        }
        System.out.println(sb);
                                           
    }
}