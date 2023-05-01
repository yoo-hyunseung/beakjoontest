import java.util.*;
import java.io.*;

public class Main{
    static int [][]map;
    static boolean[][] visit;
    static int count;
    static int[] mX = {-1,0,1,0};
    static int[] mY = {0,-1,0,1};
    static int n;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        List <Integer>answer = new ArrayList<>();
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n][n];
        for(int i = 0 ; i < n;i++){
            String str = br.readLine();
            for(int j = 0; j<n;j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }
        for(int i =0 ; i < n ; i++){
            for(int j =0 ; j< n ; j++){
                if(map[i][j] == 1 && !visit[i][j]){
                    count =1;
                    answer.add(dfs(i,j));
                }
            }
        }
        Collections.sort(answer);
        sb.append(answer.size()).append('\n');
        for(int i : answer){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
        
    }
    public static int dfs(int x, int y){
        visit[x][y] = true;
        for(int i =0 ; i < 4 ; i++){
            int nX = x+mX[i];
            int nY = y+mY[i];
            if(nX >=0 && nY >=0 && nX<n && nY<n){
                if(!visit[nX][nY] &&map[nX][nY] == 1){
                    dfs(nX,nY);
                    count+=1;
                }
            }
        }
        return count;
    }
}