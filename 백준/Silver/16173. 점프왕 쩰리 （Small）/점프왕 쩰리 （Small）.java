import java.util.*;
import java.io.*;

public class Main{
    static int [][]map;
    static boolean visited[][];

    static int dx [] = {1,0};
    static int dy [] = {0,1};

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        map = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];

        for(int i =1 ; i< map.length;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j < map.length;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(1,1);
        if(visited[n][n]){
            System.out.println("HaruHaru");
        } else{
            System.out.println("Hing");
        }
    }
    public static void dfs(int x,int y){
        visited[x][y] = true;
        for(int i =0 ; i < 2; i++){
            int mul = map[x][y];
            int px = x + (mul*dx[i]);
            int py = y + (mul*dy[i]);
            if(px>0 && px<n+1 && py>0 && py<n+1){
                if(!visited[px][py]){
                    dfs(px,py);
                }
            }
        }
    }
}