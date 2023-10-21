import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] board = new int[5][5];
    static boolean[][] visited = new boolean[5][5];
    static int dx[] = new int[] {1,0,-1,0};
    static int dy[] = new int[] {0,1,0,-1};
    static int result =Integer.MAX_VALUE;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 보드 초기화
        for(int i =0 ; i< 5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0 ; j<5;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        visited[r][c]=true;
        dfs(r,c,0,0);
        if(result==Integer.MAX_VALUE){
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
    public static void dfs(int r, int c,int depth,int apple){
        if(board[r][c]==1){
            apple++;
            if(apple==3){
                result = Math.min(result,depth);
            }
        }

        for(int i =0 ; i < 4 ; i++){
            int nextR = r + dx[i];
            int nextC = c + dy[i];
            if(nextR>=0 && nextR<5 && nextC>=0 && nextC<5){
                if(board[nextR][nextC]!=-1 && !visited[nextR][nextC]){
                    visited[nextR][nextC] =true;
                    dfs(nextR,nextC,depth+1,apple);
                    visited[nextR][nextC] =false;
                }
            }
        }
    }
}
