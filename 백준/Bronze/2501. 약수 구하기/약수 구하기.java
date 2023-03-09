import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean arr[] = new boolean[N+1];
        for(int i = 1 ; i <= Math.sqrt(N);i++){
            if(N%i == 0){
                arr[i] = true;
                arr[N/i] = true;
            }
        }
        int count =0; 
        int answer = 0;
        for(int i =1 ; i< arr.length;i++){
            if(arr[i]){
                count++;
                if(k == count)
                    answer = i;
            }
        }
        System.out.println(answer);
    }
}