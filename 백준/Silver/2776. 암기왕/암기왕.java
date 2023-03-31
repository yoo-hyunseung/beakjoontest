import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T -->0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            st = new StringTokenizer(br.readLine()," ");
            for(int i =0 ; i< n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i =0 ; i< m ; i++){
                int num = Integer.parseInt(st.nextToken());
                int start = 0;
                int end = n-1;
                boolean find = false;
                while(start <= end){
                    int mid_index = (start+end)/2;
                    int mid_value = arr[mid_index];
                    if(num < mid_value){
                        end = mid_index-1;
                    }
                    else if(num > mid_value){
                        start = mid_index+1;
                    }
                    else {
                        find = true;
                        break;
                    }
                }
                if(find){
                    sb.append(1+"\n");
                }
                else sb.append(0+"\n");
            }
        }
        System.out.println(sb);
    }
}