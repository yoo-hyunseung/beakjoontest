import java.util.*;

public class Solution {
    public Stack solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[0]);
        for(int i =1 ; i < arr.length; i ++){
            if(stk.peek() == arr[i])continue;
            else stk.push(arr[i]);
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        

        return stk;
    }
}