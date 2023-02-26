import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());        
        int arr1[][] = new int[N][M];
        int arr2[][] = new int[N][M];
        for(int i =0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j =0; j < M;j++){
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i =0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j =0; j < M;j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i =0 ; i < N ; i++){
            for(int j =0; j < M;j++){
                sb.append(arr1[i][j]+arr2[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    
}