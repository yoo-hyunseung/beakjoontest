class Solution {
    static int dp [];
    public int solution(int n) {
        int answer = 0;
        dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3 ; i < dp.length;i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        // answer = tile(n);
        answer = dp[n];
        return answer;
    }
    public static int tile(int n){
        if(n<=2){
            return dp[n];
        }
        return dp[n] = tile(n-1)%1000000007 +tile(n-2)%1000000007;
    }
}