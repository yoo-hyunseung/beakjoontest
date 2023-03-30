import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            int count = 0;
            st = new StringTokenizer(br.readLine()," ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(n ==0 && m == 0)break;
            int arr[] = new int[n];
            for(int i =0 ; i< n ; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            for(int i =0 ; i < m ; i++){
                int cd = Integer.parseInt(br.readLine());
                int start = 0;
                int end = arr.length - 1;
                while(start <= end){
                    int mid_index = (start+end)/2;
                    if(cd < arr[mid_index]){
                        end = mid_index-1;
                    }
                    else if(cd > arr[mid_index]){
                        start = mid_index+1;
                    }
                    else{
                        count++;
                        break;
                    }
                }
            }
            sb.append(count+"\n");            
        }
        System.out.println(sb);
        
    }
}