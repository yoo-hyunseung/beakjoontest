import java.io.*;
import java.util.*;

public class Main{
    static int []count = new int [10];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for(int i =0 ; i < str.length();i++){
            int num = Integer.parseInt(str.substring(i,i+1));
            count[num]++;
        }
        for(int i =count.length-1; i>=0;i--){
            if(count[i]>=1){
                sb.append(i);
                count[i]--;
                i++;
            }
        }
        System.out.println(sb);
    }
}