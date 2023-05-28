import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        StringTokenizer st;
        for(int i =0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            boolean isMeet = false;
            if(A.equals("ChongChong") || B.equals("ChongChong")){
                set.add(A);
                set.add(B);
            }
            else if(set.contains(A) || set.contains(B)){
                set.add(A);
                set.add(B);
            }
        }
        System.out.println(set.size());
    }
}