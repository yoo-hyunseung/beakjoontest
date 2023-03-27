import java.io.*;
import java.util.*;

public class Main{
    static int N,M;
    static int count =0;
    static List<Integer>[] list;
    static boolean visit[];
    public static void main(String[]args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N+1];
        visit = new boolean[N+1];
        for(int i= 0 ; i <=N;i++){
            list[i] = new ArrayList<Integer>();
        }
        for(int i =0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        for(int i =1 ; i < N+1 ; i++){
            if(!visit[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    static void dfs(int start){
        visit[start] = true;
        for(int i : list[start]){
            int next = i;
            if(!visit[next]){
                dfs(next);
                
            }
        }
    }
}