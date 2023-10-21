import java.io.*;
import java.util.*;

public class Main{
    static int [][] map;
    static int n,m;
    static boolean visited[][];
    static int [] dx = new int[]{1,0,-1,0};
    static int [] dy = new int[]{0,1,0,-1};
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        map = new int[n][m];
        visited = new boolean [n][m];
        
        for(int i =0 ; i < n ; i++){
            String str = br.readLine();
            for(int j=0 ; j<m ;j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }
        for(int i =0 ; i<m; i++){
            if(map[0][i]==0 && !visited[0][i]){
                dfs(0,i);
            }
        }
        boolean result = false;
        for(int i =0 ; i < m ; i++){
            result|=visited[n-1][i];
        }
        if(result){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        
    }
    public static void dfs(int x,int y){
        visited[x][y] = true;
        for(int i =0 ; i < 4 ; i++){
            int px = x+dx[i];
            int py = y+dy[i];
            if(px>=0 && px<n && py>=0 && py<m){
                if(!visited[px][py]){
                    if(map[px][py]==0){
                        dfs(px,py);
                    }
                }
            }
        }
    }
}