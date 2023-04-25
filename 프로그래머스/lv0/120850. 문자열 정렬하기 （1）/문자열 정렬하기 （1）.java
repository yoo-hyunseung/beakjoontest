import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int count =0;
        String result="";
        for(int i =0 ; i< my_string.length(); i++){
            char c = my_string.charAt(i);
            if(!(c>='a'&& c<='z')){
                result +=c;
            }
        }
        answer = new int[result.length()];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = result.charAt(i)-'0';
        }
        Arrays.sort(answer);
        return answer;
    }
}