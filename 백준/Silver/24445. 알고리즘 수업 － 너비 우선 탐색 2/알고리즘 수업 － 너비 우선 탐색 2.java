import java.util.*;
import java.io.*;

public class Main{
    static List<Integer>list[];
    static boolean [] visited;
    static int []count;
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
        for(int i =0 ; i < n+1; i++){
            list[i] = new ArrayList<>();
        }
        for(int i =0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        for(int i = 1; i < list.length; i++){
            Collections.sort(list[i],Collections.reverseOrder());
        }
        bfs(r);
        for(int i = 1; i < count.length;i++){
            sb.append(count[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void bfs(int r){
        Queue<Integer> q = new LinkedList<>();
        visited[r] = true;
        q.add(r);
        while(!q.isEmpty()){
            int num = q.poll();
            count[num] = ++cnt;
            for(int i =0 ; i < list[num].size();i++){
                int num2 = list[num].get(i);
                if(!visited[num2]){
                    visited[num2]=true;
                    q.add(num2);
                }
            }
        }
    }
}