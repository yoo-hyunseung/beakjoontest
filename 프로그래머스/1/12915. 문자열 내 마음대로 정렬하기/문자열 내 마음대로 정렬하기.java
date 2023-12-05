import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings,(e1,e2)->{
            if(e1.charAt(n)==e2.charAt(n)){
                return e1.compareTo(e2);
            }
            else{
                return e1.charAt(n)-e2.charAt(n);
            }
        });
        answer = strings;
        return answer;
    }
}