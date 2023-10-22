import java.io.*;
import java.util.*;

public class Main{
    static int count =0;
    static boolean visited[];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        visited = new boolean[k+1];
        bfs(a,k);
    }
    public static void bfs(int a,int k){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{a,0});
        while(!q.isEmpty()){
            int [] now = q.poll();
            if(now[0]==k){
                System.out.println(now[1]);
                return;
            }
            if(now[0]*2 <=k){
                visited[now[0]*2] =true;
                q.offer(new int[]{now[0]*2,now[1]+1});
            }
            if(!visited[now[0]+1]){
                visited[now[0]+1] = true;
                q.offer(new int[]{now[0]+1,now[1]+1});
            }
        }
    }
}