import java.io.*;
import java.util.*;

public class Main {
    static List<Integer>[] list;
    static boolean[] visited;
    static int [] count;
    static int cnt = 0;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        list = new ArrayList[n+1];
        count = new int[n+1];
        for(int i = 0 ; i < n+1; i++){
            list[i] = new ArrayList<Integer>();
        }
        visited = new boolean[n+1];
        for(int i =0 ; i <m ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        for(List<Integer> a : list){
            Collections.sort(a);
        }
        visited[r] =true;
        cnt=1;
        dfs(r);
        for(int i =1 ; i < count.length;i++){
            System.out.println(count[i]);
        }
    }
    public static void dfs(int r){
        count[r] = cnt;
        for(int i =0 ; i < list[r].size();i++){
            int num = list[r].get(i);
            if(!visited[num]){
                visited[num] =true;
                cnt++;
                dfs(num);
            }
        }
    }
}