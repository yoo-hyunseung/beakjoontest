class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(int i =0 ; i < num_str.length();i++){
            char c = num_str.charAt(i);
            if(c=='0')continue;
            else{
                answer+= (c-'1')+1;
            }
        }
        return answer;
    }
}