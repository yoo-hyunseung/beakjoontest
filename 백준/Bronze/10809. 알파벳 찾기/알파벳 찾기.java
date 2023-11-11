import java.io.*;
import java.util.*;

public class Main{
    static int arr[]= new int[26];
    public static void main(String[]args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        String str = br.readLine();
        for(int i = 0 ; i < 26; i ++){
            arr[i] = -1;
        }
        for(int i =0 ; i < str.length();i++){
            if(arr[(int)(str.charAt(i)-'a')]==-1){
                arr[(int)(str.charAt(i)-'a')] = i;
            }
        }
        for(int i = 0 ; i < arr.length;i++){
            sb.append(arr[i]+ " ");
        }
        System.out.println(sb);
    }
}