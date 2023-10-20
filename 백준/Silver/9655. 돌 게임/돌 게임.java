import java.io.*;

public class Main{
    static boolean dp[] = new boolean[1001];
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1] = true;
        dp[2] = false;
        dp[3] = true;
        boolean result = dpp(n);
        if(result){
            System.out.println("SK");
        } else{
            System.out.println("CY");
        }
    }

    public static boolean dpp(int n){
        if(n<4){
            return dp[n];
        }
        return dp[n] = !dpp(n-1);
    }
}