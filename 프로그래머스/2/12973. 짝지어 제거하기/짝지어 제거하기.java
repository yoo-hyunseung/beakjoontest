import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack <Character> stk = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stk.empty() && stk.peek() == c){
                stk.pop();
            }
            else{
                stk.push(c);
            }
        }
        answer = stk.empty() ? 1 : 0 ;
        
        return answer;
    }
}