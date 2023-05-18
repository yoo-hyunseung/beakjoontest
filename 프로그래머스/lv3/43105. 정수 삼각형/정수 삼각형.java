class Solution {
    public static Integer dp[][];
    public static int arr[][];
    public static int n;
    public int solution(int[][] triangle) {
        int answer = 0;
        n = triangle.length;
        dp = new Integer[n][n];
        arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<triangle[i].length; j++){
                arr[i][j] = triangle[i][j];
            }
            for(int k =triangle[i].length; k<n;k++)
                arr[i][k]=0;
        }
        for(int i=0; i< n; i++){
            dp[n-1][i] = arr[n-1][i];
        }
        answer = find(0,0);
        return answer;
            
    }
    public static int find(int depth,int idx){
        if(depth == n-1){
            return dp[depth][idx];
        }
        if(dp[depth][idx] == null){
            dp[depth][idx] = Math.max(find(depth+1,idx),find(depth+1,idx+1))+arr[depth][idx];
        }
        return dp[depth][idx];
        
    }
        
    
    
}