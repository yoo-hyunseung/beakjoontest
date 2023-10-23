import java.util.*;
import java.io.*;

public class Main{
    
    static int n ;
    static int map [][];
    static boolean visit[];
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n];
        for(int i =0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0 ; j< n ; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0);
        System.out.println(min);
        
    }
    static void dfs(int idx,int depth){
        if(depth == n/2){
            diff();
            return;
        }
        for(int i = idx; i < n; i++){
            if(!visit[i]){
                visit[i]= true;
                dfs(i+1, depth+1);
                visit[i] = false;
            }
        }
    }
    static void diff(){
        int start = 0;
        int link =0;
        for(int i =0; i < n-1; i++){
            for(int j = i+1; j< n; j++){
                if(visit[i] ==true && visit[j] == true){
                    start += map[i][j];
                    start +=map[j][i];
                }
                else if(visit[i] ==false&& visit[j] == false){
                    link += map[i][j];
                    link +=map[j][i];
                }
            }
        }
        int val = Math.abs(start - link);
        if(val == 0){
            System.out.println(val);
            System.exit(0);
        }
        min = Math.min(min, val);
    }
}