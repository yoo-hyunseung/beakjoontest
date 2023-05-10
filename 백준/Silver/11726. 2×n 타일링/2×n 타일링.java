import java.util.*;

public class Main{
    static Integer dp[] = new Integer [1001];
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp[1] = 1; // 길이가 1인 경우 
        dp[2] = 2; // 길이가 2인 경우 // 작은 문제를 초기화
        //bottom up
        for(int i = 3 ; i<=n ; i++){
            dp[i] = (dp[i-1]+dp[i-2])%10007;

        }
        System.out.println(dp[n]);
        
    }
}