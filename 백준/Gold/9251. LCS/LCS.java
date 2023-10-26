import java.util.*;
import java.io.*;

public class Main{
    static char str1[];
    static char str2[];
    static Integer dp[][];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str1 = br.readLine().toCharArray();
        str2 = br.readLine().toCharArray();
        int n = str1.length;
        int m = str2.length;
        dp = new Integer[n][m];
        int max =0 ;
        for(int i =0 ; i < n ;i++){
            for(int j = 0 ; j<m;j++){
                LCS(i,j);
                
            }
        }
        for(int i =0 ; i < n ;i++){
            for(int j = 0 ; j<m;j++){
                if(dp[i][j]>max){
                    max = dp[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static int LCS(int x, int y){
        if(x<0||y<0){
            return 0;
        }
        if(dp[x][y]==null){
            dp[x][y] = 0;
            if(str1[x]==str2[y]){
                dp[x][y] = LCS(x-1,y-1)+1;
            } else{
                dp[x][y] = Math.max(LCS(x-1,y),LCS(x,y-1));
            }
        }
        return dp[x][y];
    }
}