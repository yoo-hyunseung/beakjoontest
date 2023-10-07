class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int [] countlow = new int[26];
        int [] countup = new int[26];
        for(int i =0 ; i < s.length();i++){
            char c = s.charAt(i);
            if(c < 'a'){
                countup[c-'A']++;
            }
        }
        for(int i =0 ; i < s.length();i++){
            char c = s.charAt(i);
            if(c >='a'){
                countlow[c-'a']++;
            }
        }
        for(int i=countlow.length-1;i>=0;i--){
            if(countlow[i]>0){
                sb.append((char)(i+'a'));
                countlow[i]--;
                i++;
            }
        }
        for(int i=countup.length-1;i>=0;i--){
            if(countup[i]>0){
                sb.append((char)(i+'A'));
                countup[i]--;
                i++;
            }
        }
        answer = sb.toString();
        return answer;
    }
}