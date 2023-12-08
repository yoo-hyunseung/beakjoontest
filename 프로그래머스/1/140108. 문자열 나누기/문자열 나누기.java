class Solution {
    public int solution(String s) {
        int answer = 0;
        int first = 0;
        int diff =0;
        char now = s.charAt(0);
        for(int i =0 ; i < s.length(); i++){
            if(now == s.charAt(i)){
                first++;
            } else{
                diff++;
            }
            if(first==diff){
                answer++;
                first = 0;
                diff = 0;
                if(i+1<s.length()){
                    now = s.charAt(i+1);
                }
            } else if(i+1==s.length()){
                answer++;
            }
        }
        return answer;
    }
}