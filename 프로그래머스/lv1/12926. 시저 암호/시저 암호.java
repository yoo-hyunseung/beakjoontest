class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i =0  ; i <s.length(); i++){
            char c = s.charAt(i);
            if(c==' '){
                answer+=c;
            } else{
                if(c >='a'){
                    int num = ((c-'a'+n)%26)+'a';
                    answer+=(char)(num);
                } else{
                    int num = ((c-'A'+n)%26)+'A';
                    answer+=(char)(num);
                }
            }
        }
        return answer;
    }
}