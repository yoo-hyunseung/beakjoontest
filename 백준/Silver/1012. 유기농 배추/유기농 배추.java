import java.util.*;
import java.io.*;

public class Main{
    static int green[][];
    static int N,M;
    static boolean [][] visited;
    static int []dX = {1,0,-1,0};
    static int []dY = {0,-1,0,1};

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(T-->0){
            int count = 0;
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            green = new int[M][N];
            visited = new boolean[M][N];
            int K = Integer.parseInt(st.nextToken());
            for(int i = 0 ; i < K; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                green[x][y]=1;
            }
            for(int i =0 ; i < M ; i++){
                for(int j = 0 ; j < N ; j++){
                    if(green[i][j] == 1 && !visited[i][j]){
                        DFS(i,j);
                        count++;
                    }
                        
                }
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
        
        
    }
    public static void DFS(int x, int y){
        visited[x][y] = true;
        int pX = x;
        int pY = y;
        for(int i =0 ; i < 4; i++){
            pX = x + dX[i];
            pY = y + dY[i];
            if(pX >=0 && pX<M && pY >=0 && pY<N){
                if(!visited[pX][pY] && green[pX][pY]==1){
                    DFS(pX,pY);
                }
            }
        }
    }
}