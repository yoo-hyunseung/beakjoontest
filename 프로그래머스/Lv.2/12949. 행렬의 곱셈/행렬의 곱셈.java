class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        int width = arr2[0].length;
        int height = arr1.length;
        int center = arr1[0].length;
        answer = new int [height][width];
        for(int i =0 ; i < height; i++){

            for(int j = 0 ; j < width ; j++){
                // answer[i][j] = arr1[i][j];
                for(int k = 0 ; k < center;k++){
                    answer[i][j] += arr1[i][k]*arr2[k][j];
                }
            }

        }
        return answer;
    }
}