import java.util.*;
class Solution {
    static int [] dx = {1,0,-1,0};
    static int [] dy = {0,-1,0,1};
    static boolean visited[][];
    static int[][] map;
    static int n;
    static int m;
    public int solution(int[][] maps) {
        int answer = -1;
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        map = maps;
        
        BFS(0,0);
        answer = map[n-1][m-1] == 1 ? -1 : map[n-1][m-1];
        return answer;
    }
    public static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int now[] = queue.poll();
            for(int i = 0 ; i < 4; i++){
                int px = now[0] + dx[i];
                int py = now[1] + dy[i];
                if(px <n && py <m && px >=0 && py >=0){
                    if(map[px][py] == 1 && !visited[px][py]){
                        visited[px][py] = true;
                        map[px][py] = map[now[0]][now[1]]+1;
                        queue.offer(new int [] {px, py});
                    }
                }
            }
        }
    }
    
}