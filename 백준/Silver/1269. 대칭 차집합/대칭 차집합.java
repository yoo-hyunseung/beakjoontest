import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i =0 ; i < n ; i++){
            a.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i =0 ; i < m ; i++){
            int num = Integer.parseInt(st.nextToken());
            if(a.contains(num)){
                count++;
            }
            b.add(num);
        }
        int result = (a.size()+b.size())-(count*2);
        System.out.println(result);
    }
}