class Solution {
    static int dp[] = new int [4];
    int solution(int[][] land) {
        int answer = 0;
        for(int i =1 ; i < land.length;i++){
            land[i][0] += Math.max(Math.max(land[i-1][1],land[i-1][2]),land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0],land[i-1][2]),land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][1],land[i-1][0]),land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][1],land[i-1][2]),land[i-1][0]);
        }
        for(int i = 0 ; i < 4 ; i++){
            if(answer < land[land.length-1][i]){
                answer = land[land.length-1][i];
            }
        }
        return answer;
    }
}