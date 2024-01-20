
class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i< s.length();i++){
            char c = s.charAt(i);
            if(i ==0){
                c = Character.toUpperCase(c);
                sb.append(c+"");
            }
            else if(s.charAt(i-1) == ' '){
                c = Character.toUpperCase(c);
                sb.append(c+"");
            }
            else sb.append(c+"");
        }
        // System.out.println(sb);
        answer = sb.toString();
        return answer;
    }
}