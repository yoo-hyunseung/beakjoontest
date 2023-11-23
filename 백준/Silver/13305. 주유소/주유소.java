import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long [] dis = new long[n-1];
        long [] costs = new long[n];
        long mincost = 0l;
        for(int i =0 ; i < dis.length;i++){
            dis[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i =0 ; i < n ; i++){
            costs[i] = Long.parseLong(st.nextToken());
        }
        mincost = costs[0];
        long sum = 0;
        for(int i =0 ; i < n-1 ; i++){
            if(costs[i]<mincost){
                mincost=costs[i];
            }
            sum+=(mincost*dis[i]);
        }
        System.out.println(sum);
    }
}