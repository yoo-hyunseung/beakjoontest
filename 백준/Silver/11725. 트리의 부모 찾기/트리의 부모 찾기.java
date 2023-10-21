import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    static ArrayList<Integer> graph[];
    static boolean visited[];
    static int [] result;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        result = new int[n+1];
        for(int i =0 ;i < n+1; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i =0  ; i < n-1 ; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s].add(e);
            graph[e].add(s);
        }
//        System.out.println("start");
        dfs(1);
//        System.out.println("end");
        for(int i = 2; i < result.length;i++){
            System.out.println(result[i]);
        }
    }
    public static void dfs(int root){
        visited[root] = true;
        for(int i=0 ; i<graph[root].size();i++){
            int next = graph[root].get(i);
            if(!visited[next]){
                result[next]=root;
                dfs(next);
            }
        }
    }
}
