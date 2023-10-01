import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        sb.append(pivot(n));
        System.out.println(sb);
    }
    public static int pivot(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return pivot(n-1) + pivot(n-2);
    }
}