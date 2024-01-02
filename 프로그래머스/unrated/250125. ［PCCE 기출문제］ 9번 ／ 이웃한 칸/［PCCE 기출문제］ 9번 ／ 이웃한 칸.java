class Solution {
    static int [] dx = {1,0,-1,0};
    static int [] dy = {0,1,0,-1};
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int length = board.length;
        String color = board[h][w];
        for(int i = 0 ; i< 4 ; i++){
            int nextX = w+dx[i];
            int nextY = h+dy[i];
            if(nextX < length && nextX >=0 && nextY<length && nextY >=0){
                if(color.equals(board[nextY][nextX])){
                    answer++;
                }
            }
        }
        return answer;
    }
}