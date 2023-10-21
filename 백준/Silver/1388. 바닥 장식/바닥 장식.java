import java.util.*;
import java.io.*;

public class Main{
     static char[][] board;
    static boolean [][] visited;
    static int dx [] = {1,0,-1,0};
    static int dy [] = {0,1,0,-1};
    static int n,m;
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new char[n+1][m+1];
        visited = new boolean[n+1][m+1];
        // 초기화
        for(int i =1 ; i < board.length;i++){
            String str = br.readLine();
            for(int j = 0 ; j < str.length();j++){
                board[i][j+1] = str.charAt(j);
            }
        }
        int count =0;
        for(int i =1 ; i < n+1; i++){
            for(int j = 1; j < m+1;j++){
                if(!visited[i][j]){
                    char c = board[i][j];
                    dfs(i,j,c);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(int x,int y,char c){
        visited[x][y]=true;
        if(c=='|'){
            for(int i =x+1; i<n+1;i++){
                char next = board[i][y];
                if(next==c && !visited[i][y]){
                    dfs(i,y,next);
                } else if(next!=c){
                    return;
                }
            }
        }
        if(c=='-'){
            for(int i =y+1; i<m+1;i++){
                char next = board[x][i];
                if(next==c && !visited[x][i]){
                    dfs(x,i,next);
                } else if(next!=c){
                    return;
                }
            }
        }
    }
}