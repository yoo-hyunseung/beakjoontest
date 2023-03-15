import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int [5];
        int sum =0;
        for(int i = 0 ; i < 5; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        Arrays.sort(arr);
        sum/=5;
        sb.append(sum).append("\n").append(arr[2]);
        System.out.println(sb);
        
    }
}