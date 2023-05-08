import java.io.*;
import java.util.*;

public class Main{
    static int n,m,k;
    static int dx[] = {1,0,-1,0};
    static int dy[] = {0,1,0,-1};
    static int map[][];
    static boolean visited[][];
    static int answer;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];
        for(int i =0 ; i < k ; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
        }
        int max = Integer.MIN_VALUE;
        for(int i =1 ;i <= n ; i++){
            for(int j = 1 ; j <= m ; j ++){
                if(map[i][j]==1 && !visited[i][j]){
                    answer = 1;
                    BFS(i,j);
                    if(max < answer)max = answer;
                }

            }
        }
        System.out.println(max);
    }
    public static void BFS(int x, int y){
        Queue <int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int [] now = queue.poll();
            for(int i =0 ; i < 4 ; i++){
                int px = now[0] + dx[i];
                int py = now[1] + dy[i];
                if(px >= 1 && py >=1 && px <= n && py <=m){
                    if(map[px][py] == 1 && !visited[px][py]){
                        queue.add(new int[] {px,py});
                        visited[px][py]= true;
                        answer++;
                    }
                }
            }

        }
    }
}