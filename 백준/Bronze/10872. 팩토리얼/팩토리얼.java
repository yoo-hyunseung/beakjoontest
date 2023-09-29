import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        sb.append(factorial(n));
        System.out.println(sb);
    }
    public static int factorial(int n){
        if(n<=1)return 1;
        return factorial(n-1)*n;
    }
}