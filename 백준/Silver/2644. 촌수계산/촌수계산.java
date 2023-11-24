import java.io.*;
import java.util.*;

public class Main{
    static List<Integer>[] list;
    static boolean[]visit;
    static int res = -1;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList[n+1];
        visit = new boolean[n+1];
        for(int i =1 ; i < n+1; i++){
            list[i] = new ArrayList<>();
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        int l = Integer.parseInt(br.readLine());
        for(int i =0 ; i < l ; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list[p].add(c);
            list[c].add(p);
        }
        dfs(x,y,0);
        System.out.println(res);
    }
    static void dfs(int start, int end, int cnt){
        if(start == end){
            res = cnt;
            return;
        }
        visit[start] =true;
        for(int i = 0 ; i<list[start].size() ; i++){
            int next = list[start].get(i);
            if(!visit[next]){
                dfs(next,end,cnt+1);
            }
        }
    }
}