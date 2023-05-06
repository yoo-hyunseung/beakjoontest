import java.io.*;
import java.util.*;

public class Main{
    static int[][]box;
    static int n;
    static int m;
    static int [] dx = {1,0,-1,0};
    static int [] dy = {0,1,0,-1};
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        box = new int[m][n];
        
        for(int i =0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                int k = Integer.parseInt(st.nextToken());
                box[i][j] = k;
                if(k == 1){
                    queue.offer(new int[] {i,j});
                }
            }
        }
        BFS();
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i < m ;i++){
            for(int j = 0 ; j < n ; j++){
                if(max < box[i][j])max = box[i][j];
                if(box[i][j]==0){
                    max = -1;
                    System.out.println(max);
                    return;
                }
            }
        }
        System.out.println(max-1);
    }
    public static void BFS(){
        while(!queue.isEmpty()){
            int [] now = queue.poll();
            for(int i =0 ; i < 4 ; i++){
                int px = now[0] + dx[i];
                int py = now[1] + dy[i];
                if(px<m && py < n && px>=0 && py >=0){
                    if(box[px][py]==0){
                        box[px][py] = box[now[0]][now[1]]+1;
                        queue.offer(new int[]{px,py});
                    }
                }
            }
        }
    }
}