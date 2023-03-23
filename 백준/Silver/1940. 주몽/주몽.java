import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int arr[] = new int[N+1];
        
        st = new StringTokenizer(br.readLine()," ");
        
        for(int i =1 ; i <= N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int start_index = 1;
        int end_index = N;
        int count =0;
        while(start_index < end_index){
            if(arr[start_index] + arr[end_index] == M){
                count++;
                start_index++;
                end_index--;
            }
            else if(arr[start_index] + arr[end_index] < M){
                start_index++;
            }
            else{
                end_index--;
            }
        }
        System.out.println(count);
    }
}