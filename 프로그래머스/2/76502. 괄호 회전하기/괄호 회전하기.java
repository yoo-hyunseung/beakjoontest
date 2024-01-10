import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(s);
        
        for(int i = 0 ;i < s.length();i++){
            char c = sb.charAt(0);
            sb = sb.deleteCharAt(0);
            sb.append(c);
            if(isGood(sb.toString())){
                answer++;
            }
        }
        return answer;
    }
    public boolean isGood(String s){
        if(s.startsWith(")") || s.startsWith("]") || s.startsWith("}")){
            return false;
        } else{
            Stack<Character> stk = new Stack<>();
            for(int i =0 ; i < s.length();i++){
                char c = s.charAt(i);
                if(c == '('){
                    stk.push(c);
                } else if(c == '['){
                    stk.push(c);
                } else if(c == '{'){
                    stk.push(c);
                } else if(c==')'){
                    if(!stk.empty()){
                        if(stk.peek()=='('){
                            stk.pop();
                        }
                    }
                } else if(c==']'){
                    if(!stk.empty()){
                        if(stk.peek()=='['){
                            stk.pop();
                        }
                    }
                } else if(c=='}'){
                    if(!stk.empty()){
                        if(stk.peek()=='{'){
                            stk.pop();
                        }
                    }
                }
            }
            if(stk.empty()){
                return true;
            } else{
                return false;
            }
        }
    }
}