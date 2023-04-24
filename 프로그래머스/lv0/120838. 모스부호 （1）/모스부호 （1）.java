import java.util.StringTokenizer;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String [] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringTokenizer st = new StringTokenizer(letter, " ");
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            for(int i =0 ; i< str.length; i++){
                if(s.equals(str[i])){
                    answer +=(char)(i+97)+"";
                }
            }
        }

        return answer;
    }
}