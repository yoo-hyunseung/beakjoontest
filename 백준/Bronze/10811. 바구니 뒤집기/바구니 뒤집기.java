import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N+1];
        for(int i =1 ; i < arr.length; i++ ){
            arr[i] = i;
        }
        for(int i =0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;
            int tmp=0;
            for(int j = a; j <= sum/2; j++){
                tmp = arr[j];
                arr[j] = arr[b];
                arr[b] = tmp;
                b--;
            }
        }
        for(int i = 1; i < arr.length; i++){
            sb.append(arr[i]+" ");
        }
        System.out.println(sb);
    }
}