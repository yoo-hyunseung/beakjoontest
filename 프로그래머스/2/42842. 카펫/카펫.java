class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown + yellow;
        for(int i = 1; i <= total ; i++){
            int row = i;
            int col = total/i;
            if(row >=3 && col>=3){
                if(((row-2)*(col-2)) == yellow)
                    answer = new int []{row, col};
            }
        }
        return answer;
    }
}