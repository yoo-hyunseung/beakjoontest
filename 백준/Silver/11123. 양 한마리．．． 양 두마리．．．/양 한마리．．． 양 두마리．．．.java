import java.io.*;
import java.util.*;

public class Main{
    static int h,w;
    
    static int dx[] = new int[] {1,0,-1,0};
    static int dy[] = new int[] {0,1,0,-1};
    
    static char[][] map;
    static boolean [][] counted;
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int count = 0;
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            
            map = new char[h][w];
            counted = new boolean[h][w];
            
            for(int i =0 ; i < h ; i++){
                String str = br.readLine();
                for(int j = 0 ; j < w ; j++){
                    map[i][j] = str.charAt(j);
                }
            }
            
            for(int i =0 ; i < h ; i++){
                for(int j =0 ; j < w ; j++){
                    if(!counted[i][j] && map[i][j]=='#'){
                        dfs(i,j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int x, int y){
        counted[x][y] = true;
        for(int i =0 ; i < 4 ;i++){
            int px = x + dx[i];
            int py = y + dy[i];
            if(px>=0 && px < h && py>=0 && py<w){
                if(!counted[px][py] && map[px][py]=='#'){
                    dfs(px,py);
                }
            }
        }
    }
}