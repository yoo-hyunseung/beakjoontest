import java.util.*;
import java.io.*;

public class Main{
    static Integer tile[] = new Integer[1001];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tile[0] = 0;
        tile[1] = 1;
        tile[2] = 2;
        tile[3] = 3;
        System.out.println(recur(n));
    }
    public static int recur(int n){
        if(tile[n]==null){
            tile[n] = (recur(n-1)+recur(n-2))%10007;
        }
        return tile[n];
    }
}