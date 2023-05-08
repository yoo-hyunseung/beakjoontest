import java.io.*;
import java.util.*;

public class Main{
    static int [][]map ;
    static boolean [] visit;
    static int m,n,v;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        visit = new boolean[n+1];
        for(int i=0 ; i < n+1; i++){
            for(int j = 0 ; j < n+1; j++){
                map[i][j] = 0;
            }
        }
        for(int i =0 ; i <m ;i++){
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }
        dfs(v);
        System.out.println();
        for(int i =0 ; i < visit.length ;i++){
            visit[i] = false;
        }
        bfs(v);
    }
    public static void dfs(int i){
        visit[i] =true;
        System.out.print(i+" ");
        for(int j=1; j < n+1; j++){
            if(map[i][j] == 1 && visit[j] ==false){
                dfs(j);
            }
        }
    }
    public static void bfs(int i){
        Queue <Integer> q = new LinkedList<>();
        q.offer(i);
        visit[i] =true;
        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp +" ");
            for(int j = 1; j <n+1;j++){
                if(map[temp][j] == 1 && visit[j] == false){
                    q.offer(j);
                    visit[j] = true;
                }
            }
        }
    }
}