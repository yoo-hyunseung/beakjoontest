class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        int dp [] = new int [y+1];
        for(int i = x ; i < dp.length; i++){
            if(x!=i && dp[i]==0){
                dp[i] = -1;
                continue;
            }
            if(i+n <=y){
                if(dp[i+n]==0){
                    dp[i+n] = dp[i]+1;
                } else{
                    dp[i+n] = Math.min(dp[i]+1, dp[i+n]);
                }
            }
            if(i*2 <=y){
                if(dp[i*2]==0){
                    dp[i*2] = dp[i]+1;
                } else{
                    dp[i*2] = Math.min(dp[i]+1, dp[i*2]);
                }
            }
            if(i*3 <=y){
                if(dp[i*3]==0){
                    dp[i*3] = dp[i]+1;
                } else{
                    dp[i*3] = Math.min(dp[i]+1, dp[i*3]);
                }
            }
        }
        answer = dp[y];
        return answer;
    }
}