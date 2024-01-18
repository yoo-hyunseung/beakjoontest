import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int index = 0; // 오더 포인터
        Stack<Integer> stk = new Stack<>();
        for(int i =0 ; i< order.length;i++){
            if(i+1 == order[index]){
                answer++;
                index++;
            } else{
                stk.push(i+1);
            }
            while(!stk.isEmpty() && stk.peek()==order[index]){
                answer++;
                index++;
                stk.pop();
            }
        }
        return answer;
    }
}