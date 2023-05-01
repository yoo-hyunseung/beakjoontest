import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(my_string);
        answer = Integer.parseInt(st.nextToken());
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.equals("+")){
                answer += Integer.parseInt(st.nextToken());
            }
            else{
                answer -= Integer.parseInt(st.nextToken());
            }
        }
        return answer;
    }
}