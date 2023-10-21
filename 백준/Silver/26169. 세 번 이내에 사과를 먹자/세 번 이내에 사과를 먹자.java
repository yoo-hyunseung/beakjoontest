import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] board = new int[5][5];
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int result=0;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 보드 초기화
        for(int i =0 ; i < 5 ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 5 ; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        dfs(r,c,0,0);

        System.out.println(result);
    }
    public static void dfs(int r, int c,int depth,int apple){
        // 사과가 매개변수로 안들어가면 갯수가 누적된다.
        if(board[r][c]==1) {
            apple++;
        }
        if(depth==3){
            if(apple>=2){
                result = 1;
            }
            return;
        }
        for(int i =0 ; i < 4 ; i++){
            int nextR = r+dx[i];
            int nextC = c+dy[i];
            if(nextR >=0 && nextR<5 && nextC>=0 && nextC<5){
                if (board[nextR][nextC]!=-1) {
                    board[r][c] = -1;
                    dfs(nextR,nextC,depth+1,apple); // 움직임
                    board[r][c] = 0;
                }
            }
        }
    }
}