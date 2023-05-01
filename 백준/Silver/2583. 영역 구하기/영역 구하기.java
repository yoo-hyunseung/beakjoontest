import java.io.*;
import java.util.*;

public class Main{
    static int m,n,k;
    static int [][]map;
    static boolean [][]visited;
    static int count;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int sX,eX,sY,eY;
        map = new int[m][n];
        visited = new boolean[m][n];
        List<Integer> list = new ArrayList<>();
        for(int ii =0 ; ii < k ; ii++){
            st = new StringTokenizer(br.readLine());
            sY = Integer.parseInt(st.nextToken());
            sX = Integer.parseInt(st.nextToken());
            eY = Integer.parseInt(st.nextToken())-1;
            eX = Integer.parseInt(st.nextToken())-1;
            for(int i = sX; i <=eX ; i++){
                for(int j = sY ; j <= eY ; j++){
                    map[i][j] = 1;
                }
            }
        }
        for(int i = 0 ; i < m ; i ++){
            for(int j =0  ; j < n ; j++){
                if(map[i][j] == 0 && !visited[i][j]){
                    count= 1;
                    list.add(DFS(i,j));
                }
            }
        }
        sb.append(list.size()).append("\n");
        Collections.sort(list);
        for(int i : list){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
    public static int DFS(int x , int y){
        visited[x][y] = true;
        for(int i =0 ; i < 4 ; i++){
            int px = x + dx[i];
            int py = y + dy[i];
            if(px >=0 && py >=0 && px < m && py <n){
                if(map[px][py] == 0 && !visited[px][py]){
                    DFS(px,py);
                    count++;
                }
            }
        }
        return count;
    }
}