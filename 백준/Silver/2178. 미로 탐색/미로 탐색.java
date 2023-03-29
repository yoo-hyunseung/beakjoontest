import java.io.*;
import java.util.*;

public class Main{
    static int arr[][];
    static int isVisit[][];
    static int n,m;
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[n+1][m+1];
        isVisit = new int[n+1][m+1];
        for(int i =1 ; i < n+1; i++){
            String str = br.readLine();
            for(int j=1 ; j < m+1; j++){
                arr[i][j] = str.charAt(j-1)-'0';
            }
        }
        bfs();
        
    }
    public static void bfs(){
        Queue <Location> q = new LinkedList<>();
        q.offer(new Location(1,1));
        int []xArr = {-1,0,1,0};
        int []yArr = {0,-1,0,1};
        isVisit[1][1] = 1;
        
        while(!q.isEmpty()){
            Location location = q.poll();
            int row = location.row;
            int col = location.col;
            for(int i = 0; i < 4 ; i++){
                int x = row + xArr[i];
                int y = col + yArr[i];
                if(checkLocation(x,y)){
                    q.offer(new Location(x,y));
                    isVisit[x][y] = isVisit[row][col] +1;
                }
            }
        }
        System.out.println(isVisit[n][m]);//도착지
    }
    public static boolean checkLocation(int row, int col){
        if(row < 1 || row > n || col < 1 || col > m){
            return false;
        }
        if(arr[row][col] == 0 || isVisit[row][col] != 0){
            return false;
        }
        return true;
    }
}
class Location{
    int row, col;
    public Location(int row , int col){
        this.row = row;
        this.col = col;
    }
}