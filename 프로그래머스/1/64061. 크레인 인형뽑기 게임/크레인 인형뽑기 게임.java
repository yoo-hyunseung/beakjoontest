import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        for(int i =0 ; i< moves.length;i++){
            int line = moves[i];
            int n = 0;
            for(int j =0 ; j < board.length;j++){
                n = board[j][line-1];
                if(n !=0){
                   board[j][line-1] = 0;
                   break;
                }
            }
            if(n == 0) continue;
            if(!stk.isEmpty()){
                if(stk.peek()==n){
                    stk.pop();
                    answer+=2;
                } else{
                    stk.push(n);
                }
            } else{
                stk.push(n);
            }
        }
        return answer;
    }
}