import java.util.*;
import java.io.*;

public class Main{
    static int [][]map;
    static boolean[][] visited;
    static int count,m,n,big,max;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        for(int i =0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m ; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i =0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    big = 1;
                    max = Math.max(DFS(i,j),max);
                    count++;
                }
            }
        }
        sb.append(count).append("\n").append(max);
        System.out.println(sb);
        
    }
    public static int DFS(int x, int y){
        visited[x][y] = true;
        for(int i =0 ; i < 4 ; i++){
            int px = x + dx[i];
            int py = y + dy[i];
            if(px >=0 && py>=0 && px<n && py<m){
                if(map[px][py] == 1 && !visited[px][py]){
                    DFS(px,py);
                    big++;
                }
            }
        }
        return big;
    }
}