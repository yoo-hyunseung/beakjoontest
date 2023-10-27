class Solution {
    
    static int arr[][];
    static Integer dp[][];
    static int n;
    public int solution(int[][] triangle) {
        int answer = 0;
        n = triangle.length;
        arr = new int[n][n];
        dp = new Integer[n][n];
        for(int i =0 ; i< n ; i++){
            for(int j =0 ; j<triangle[i].length;j++){
                arr[i][j] = triangle[i][j];
            }
            for(int j = triangle[i].length ;j<n;j++ ){
                arr[i][j] = 0;
            }
        }
        for(int i = 0 ; i <n;i++){
            dp[n-1][i] = arr[n-1][i];
        }
        answer = find(0,0);
        return answer;
    }
    public static int find(int depth,int index){
        if(depth==n-1){
            return dp[depth][index];
        } 
        if(dp[depth][index]==null){
            dp[depth][index]=Math.max(find(depth+1,index),find(depth+1,index+1))+arr[depth][index];
        }
        return dp[depth][index];
    }
}