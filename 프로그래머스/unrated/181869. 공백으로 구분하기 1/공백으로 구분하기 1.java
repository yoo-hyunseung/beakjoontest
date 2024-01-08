import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        StringTokenizer st = new StringTokenizer(my_string," ");
        int len = st.countTokens();
        answer = new String[len];
        for(int i =0 ; i < len ;i++){
            answer[i] = st.nextToken();
        }
        return answer;
    }
}