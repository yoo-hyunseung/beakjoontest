import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = Integer.MIN_VALUE;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i =0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for(int i = 0 ; i < K ; i++){
            sum +=arr[i];
        }
        int start_index = 0;
        int end_index = K;
        while(start_index != N){
            if(max < sum){
                max = sum;
            }
            sum-=arr[start_index];
            start_index++;
            end_index%=N;
            sum+=arr[end_index];
            end_index++;            
        }
        System.out.println(max);
    }
}