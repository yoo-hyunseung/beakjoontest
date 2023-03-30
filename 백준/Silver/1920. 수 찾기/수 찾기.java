import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int [N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i < M ; i++){
            boolean find = false;
            int value = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = arr.length - 1;
            while(start <= end){
                int mid_index = (start+end)/2;
                int mid_value = arr[mid_index];
                if(mid_value > value){
                    end = mid_index-1;
                }
                else if(mid_value < value){
                    start = mid_index+1;
                }
                else {
                    find =true;
                    break;
                }
            }
            if(find){
                sb.append(1+"\n");
            }
            else{
                sb.append(0+"\n");
            }
        }
        System.out.println(sb);
    }
}