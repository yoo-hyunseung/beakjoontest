import java.io.*;
import java.util.*;

public class Main{
    static char[][] map;
    static int dx[] = new int[] {1,0,-1,0};
    static int dy[] = new int[] {0,1,0,-1};
    static boolean [][]visited;
    static int meet=0;
    static int n,m;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new char[n+1][m+1];
        visited = new boolean[n+1][m+1];
        //도연 위치
        int x = 0;
        int y = 0;
        
        // 초기화
        for(int i =1 ; i < n+1; i++){
            String str = br.readLine();
            for(int j=0 ; j < str.length();j++){
                char c = str.charAt(j);
                map[i][j+1] = c;
                if(c=='I'){
                    x = i;
                    y = j+1;
                }
            }
        }
        dfs(x,y);
        if(meet==0){
            System.out.println("TT");
        } else{
            System.out.println(meet);
        }
        
    }
    public static void dfs(int x, int y){
        visited[x][y] = true;
        if(map[x][y] =='P')meet++;
        for(int i =0 ; i< 4 ; i+=1){
            int px = x + dx[i];
            int py = y + dy[i];
            if(px>=1 && px<n+1 && py >=1 && py<m+1){
                if(!visited[px][py] && map[px][py] !='X'){
                    dfs(px,py);
                }
            }
        }
    }
}