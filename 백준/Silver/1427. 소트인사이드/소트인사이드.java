import java.io.*;
import java.util.*;

public class Main{
    static int arr[];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int N = str.length();
        arr = new int[N];
        for(int i = 0 ;i < N ; i++){
            arr[i] = str.charAt(i)-'0';
        }
        int index = 0;
        while(index < N){
            int max = Integer.MIN_VALUE;
            int fin = 0;
            for(int i = index ; i<N ;i++){
                if(max < arr[i]){
                    max = arr[i];
                    fin = i;
                }
            }

            swap(index, fin);
            sb.append(arr[index]);
            index++;
        }
        System.out.println(sb);
    }
    public static void swap(int i , int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}