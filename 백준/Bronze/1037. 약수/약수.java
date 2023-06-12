import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(n-->0){
            int i = Integer.parseInt(st.nextToken());
            if(i>max)max=i;
            if(i<min)min=i;
        }
        System.out.println(max*min);
    }
}