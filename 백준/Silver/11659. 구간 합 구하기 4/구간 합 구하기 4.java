import java.io.*;
import java.util.*;

public class Main{
    static int S[];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int A[] = new int[N+1];
        S = new int[N+1];
        
        st = new StringTokenizer(br.readLine()," ");

        for(int i =1 ; i <= N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        S[1] = A[1];
        for(int i = 1; i <= N ; i++){
            S[i] = S[i-1]+A[i];
        }
        
        for(int x =0 ; x < M; x++){
            st = new StringTokenizer(br.readLine(), " ");

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(sum(i,j)).append("\n");
        }
        System.out.println(sb);
    }
    static int sum(int i, int j){
        return S[j]-S[i-1];
    }
}