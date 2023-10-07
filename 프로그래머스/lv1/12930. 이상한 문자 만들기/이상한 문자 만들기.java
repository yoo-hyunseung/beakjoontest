class Solution {
    public String solution(String s) {
        String answer = "";
        int idx=0;
        s = s.toLowerCase();
        for(int i = 0 ; i < s.length();i++){
            char c= s.charAt(i);
            if(c==' '){
                idx=0;
                answer+=c;
            } 
            else {
                if(idx%2==0){
                    answer += (char)(c-32);
                    idx++;
                }
                else{
                    answer += (char)(c);
                    idx++;
                }
            }
        }
        return answer;
    }
}