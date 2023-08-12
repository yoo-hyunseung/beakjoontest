import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int []arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int w = arr[n-1];
        for(int i = n-2; i>=0; i--)
        {
            int w1 = arr[i]*(n-i);
            if(w < w1){
                w = w1;
            }
        }
        System.out.println(w);
    }
}