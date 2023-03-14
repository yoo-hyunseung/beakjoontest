import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine() , " ");
        int max = Integer.MIN_VALUE;
        int n = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int arr[] = new int [n];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(black(arr,total,n));
    }
    public static int black(int arr[],int total,int n){
        int result=0;
        for(int i =0 ; i < n-2; i++){
            int sum = 0;
            for(int j =i+1; j<n-1; j++){
                for (int k = j+1; k < n ; k++){
                    sum = arr[i]+arr[j]+arr[k];
                    if(sum == total)
                        return sum;
                    
                    if(result < sum && sum <total){
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
    
}