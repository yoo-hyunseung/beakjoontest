import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int [numbers.length];
        Stack <Integer> stk = new Stack<>();
        for(int i = numbers.length-1; i>=0 ; i--){
            int num = numbers[i];
            answer[i] = -1;
            while(!stk.empty()){
                int top = stk.peek();
                if(top > num){
                    answer[i] = top;
                    break;
                }
                stk.pop();
            }
            stk.push(num);
        }
        return answer;
    }
}