class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char [] str = my_string.toCharArray();
        char c = str[num1];
        str[num1] = str[num2];
        str[num2] = c;
        for(char c1 : str){
            sb.append(c1);
        }
        answer = sb.toString();
        return answer;
    }
}