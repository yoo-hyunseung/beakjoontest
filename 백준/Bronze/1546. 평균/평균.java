import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = -1;
        double sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0 ; i< N; i++){
            int score = Integer.parseInt(st.nextToken());
            if(max < score){
                max = score;
            }
            sum += score;
        }
        double result = sum/max*100.0/N;
        System.out.println(result);
    }
}