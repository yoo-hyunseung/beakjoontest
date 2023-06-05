import java.io.*;
import java.util.*;

public class Main{
    static List<Integer>[] list;
    static boolean [] visited;
    static int [] count;
    static int cnt;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        list = new ArrayList[n+1];
        visited = new boolean[n+1];
        count = new int[n+1];
        for(int i = 0 ; i < n+1; i++){
            list[i] = new ArrayList<>();
        }
        for(int i =0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        for(int i = 0 ; i < n+1; i++){
            Collections.sort(list[i],Collections.reverseOrder());
        }
        cnt=1;
        visited[r] = true;
        dfs(r);
        for(int i=1 ; i<count.length; i++){
            sb.append(count[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void dfs(int r){
        count[r] = cnt;
        for(int i =0 ; i < list[r].size();i++){
            int num = list[r].get(i);
            if(!visited[num]){
                cnt++;
                visited[num] = true;
                dfs(num);
            }
        }
    }
}