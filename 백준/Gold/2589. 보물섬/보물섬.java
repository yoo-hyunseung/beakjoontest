import java.util.*;
import java.io.*;

public class Main{
    static int[] dx = {1,0,-1,0};
    static int [] dy = {0,1,0,-1};
    static int n,m;
    static char[][] map;
    static int visited[][];
    static  int answer;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new char[n][m];
        visited = new int [n][m];
        for(int i =0 ; i < n; i ++){
            String str = br.readLine();
            for(int j = 0 ; j < m ; j++){
                map[i][j] = str.charAt(j);
            }
        }
        for(int i =0  ; i < n ; i++){
            for(int j =0 ; j < m ; j++){
                if(map[i][j] == 'L'){
                    distance(i,j);
                }
            }
        }
        System.out.println(answer);

    }
    public static void distance(int x , int y){
        Queue <int[]> queue = new LinkedList<>();
        for(int i =0 ; i < n ; i++){
            for(int j = 0 ; j < m; j++){
                visited[i][j] =1;
            }
        }
        queue.offer(new int[]{x,y});
        visited[x][y] = 0;
        while(!queue.isEmpty()){
            int now[] = queue.poll();
            for(int i =0 ; i < 4 ; i++){
                int px = now[0] + dx[i];
                int py = now[1] + dy[i];
                if(px <n && py < m && px >=0 && py >=0){
                    if(visited[px][py]==1 && map[px][py] == 'L'){
                        queue.offer(new int [] {px,py});
                        visited[px][py] = visited[now[0]][now[1]]+1;
                        answer = Math.max(answer,visited[px][py]);
                    }
                }
            }

        }

    }
}