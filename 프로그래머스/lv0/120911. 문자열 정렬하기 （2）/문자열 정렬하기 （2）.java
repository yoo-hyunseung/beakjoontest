import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        my_string = my_string.toLowerCase();
        char c [] = my_string.toCharArray();
        Arrays.sort(c);
        for(char a : c){
            sb.append(a);
        }
        answer = sb.toString();
        return answer;
    }
}