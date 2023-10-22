import java.io.*;
import java.util.*;

public class Main{
    static int [][] display;
    static boolean [][] visited;
    static int dx [] = new int [] {1,0,-1,0};
    static int [] dy = new int [] {0,1,0,-1};
    static int count=0;
    static int m,n;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        display = new int[n+1][m+1];
        visited = new boolean [n+1][m+1];
        double avg[][] = new double [n+1][m+1];
        for(int i =1; i< n+1 ; i++){
            st = new StringTokenizer(br.readLine());
            int sum=0;
            int index = 1;
            for(int j = 1 ; j<=(m*3);j++){
                sum+=Integer.parseInt(st.nextToken());
                if(j%3 ==0){
                    avg[i][index] = sum/3.0;
                    sum=0;
                    index++;
                }
            }
        }
        int t = Integer.parseInt(br.readLine());
        for(int i= 1 ; i < n+1;i++){
            for(int j = 1; j < m+1; j++){
                if(avg[i][j]>=(double)t){
                    display[i][j] = 255;
                } else{
                    display[i][j] = 0;
                }
            }
        }
        for(int i= 1 ; i < n+1;i++){
            for(int j = 1; j < m+1; j++){
                if(!visited[i][j] && display[i][j]!=0){
                    count++;
                    dfs(i,j);
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i =0 ; i < 4; i++){
            int px = x+dx[i];
            int py = y+dy[i];
            if(px>0 && px<=n && py >0 && py <=m){
                if(!visited[px][py] && display[px][py]!=0){
                    dfs(px,py);
                }
            }
        }
    }
}