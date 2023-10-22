import java.util.*;
import java.io.*;

public class Main{
    static int n;
    static int []map;
    static boolean visited[];
    static int count =0;
    static int [] dx = new int[] {-1,1};
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        map = new int[n+1];
        visited = new boolean[n+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 1 ; i < n+1 ; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        int start = Integer.parseInt(br.readLine());
        dfs(start);
        System.out.println(count+1);
    }
    public static void dfs(int x){
        visited[x] = true;
        for(int i =0 ; i < 2 ; i++){
            int px = x + map[x]*dx[i];
            if(px>0 && px <=n){
                if(!visited[px]){
                    count++;
                    dfs(px);
                }
            }
        }
    }
}