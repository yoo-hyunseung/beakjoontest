import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long []tree = new long[n];
        long max = 0;
        long min = 0;
        long mid = 0;
        st = new StringTokenizer(br.readLine());
        for(int i =0 ; i < n ; i++){
            tree[i] = Long.parseLong(st.nextToken());
            if(max < tree[i])max = tree[i];
        }
        

        while(min < max){
            mid = (max+min)/2;
            long cut = 0;
            for(int i =0 ; i < n ;i++){
                if(tree[i]-mid >0){
                    cut +=(tree[i]-mid);
                }
            }
            if(cut<m){
                max =mid;
            }
            else{
                min=mid+1;
            }
        }
        System.out.println(min-1);
    }
}