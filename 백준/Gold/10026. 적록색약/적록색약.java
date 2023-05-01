import java.io.*;
import java.util.*;

public class Main{
    static char pic [][];
    static boolean visited[][];
    static int dx[] = {0,-1,0,1};
    static int dy[] = {1,0,-1,0};
    static int count;
    static int count1;
    static int n;
    public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        pic = new char [n][n];
        visited = new boolean[n][n];
        for(int i =0 ; i < n ; i++){
            String str = br.readLine();
            for(int j =0 ; j<n ; j++){
                pic[i][j] = str.charAt(j);
            }
        }
        for(int i =0 ; i < n ; i++){
            for(int j =0 ; j<n ; j++){
                if(!visited[i][j]){
                    DFS(i,j);
                    count++;
                }
            }
        }
        for(int i =0 ; i < n ; i++){
            for(int j =0 ; j<n ; j++){
                visited[i][j] = false;
                if(pic[i][j] == 'G')pic[i][j] = 'R';
            }
        }
        for(int i =0 ; i < n ; i++){
            for(int j =0 ; j<n ; j++){
                if(!visited[i][j]){
                    DFS(i,j);
                    count1++;
                }
            }
        }
        sb.append(count).append(" ").append(count1);
        System.out.println(sb);
    }
    public static void DFS(int x, int y){
        visited[x][y] = true;
        for(int i =0 ; i < 4 ; i++){
            int px = x + dx[i];
            int py = y + dy[i];
            if(px>=0 && py>=0 && px<n && py <n){
                if(pic[x][y] == pic[px][py] && !visited[px][py]){
                    DFS(px,py);
                }
            }
        }
        
    }
}
