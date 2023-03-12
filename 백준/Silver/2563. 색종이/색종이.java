import java.io.*;
import java.util.*;

public class Main{
    static int arr[][] = new int[101][101];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int sum=0;
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 1 ; j < arr.length ; j++){
                arr[i][j]=0;
            }
        }
        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            fill(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 1 ; j < arr.length ; j++){
                if(arr[i][j] == 1)sum +=1;
            }
        }
        System.out.println(sum);
    }
    static void fill(int a, int b){
        for(int i = a ; i < a+10; i++){
            for(int j = b ; j < b+10; j++){
                arr[i][j] = 1;
            }
        }
    }
}