import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int []num = new int[N.length()];
        for(int i =0 ; i < N.length(); i++){
            num[i] = Integer.parseInt(N.substring(i,i+1));
        }
        for(int i=0 ; i < N.length();i++){
            int max = i;
            for(int j= i+1; j < N.length();j++){
                if(num[j]>num[max]){
                    max = j;
                }
            }
            if(num[max]>num[i]){
                int temp = num[max];
                num[max] = num[i];
                num[i] = temp;
            }
        }
        for(int i =0 ; i < N.length();i++){
            System.out.print(num[i]);
        }
    }
}