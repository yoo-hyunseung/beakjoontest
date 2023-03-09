import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == -1){
                break;
            }
            else{
                boolean arr[] = new boolean[n+1];
                int sum =0;
                for(int i = 1; i <= Math.sqrt(n) ; i++){
                    if(n%i == 0){
                        arr[i] = true;
                        arr[n/i] = true;
                    }
                }
                for(int i =1 ; i < arr.length-1;i++){
                    if(arr[i])sum+=i;
                }
                if(sum == n){
                    sb.append(n).append(" = 1");
                    for(int i = 2; i < arr.length-1;i++){
                        if(arr[i]){
                            sb.append(" + ").append(i);
                        }
                    }
                }
                else{
                    sb.append(n).append(" is NOT perfect.");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}