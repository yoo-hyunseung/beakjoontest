import java.io.*;
import java.util.*;

public class Main{
    static int [] map;
    static boolean visited[];
    static int n;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0 ; i < n ;i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        bfs(0,n-1);
        visited[0] = true;
        if(!visited[n-1]){
            System.out.println(-1);
        }
    }
    public static void bfs(int start, int end){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{start,0});
        while(!q.isEmpty()){
            int [] now = q.poll();
            if(now[0] == end){
                System.out.println(now[1]);
                return;
            }
            for(int i =map[now[0]] ; i>=1;i--){
                if(now[0]+i <= end && !visited[now[0]+i]){
                    visited[now[0]+i]=true;
                    q.offer(new int[]{now[0]+i,now[1]+1});
                }
            }
        }
    }
}