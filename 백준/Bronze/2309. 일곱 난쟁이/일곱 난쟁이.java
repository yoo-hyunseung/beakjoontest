import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int [9];
        int sum =0;
        for(int i =0 ; i< 9 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        for(int i =0 ; i<8;i++){
            for(int j = i+1; j<9;j++){
                if(sum-(arr[i]+arr[j]) == 100){
                    arr[i] = -1;
                    arr[j] = -1;
                    Arrays.sort(arr);
                    for(int k = 2 ; k <9 ; k++){
                        System.out.println(arr[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}