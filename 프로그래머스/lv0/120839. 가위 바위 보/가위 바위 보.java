class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i =0 ; i < rsp.length() ;i ++){
            if('2' == rsp.charAt(i)){
                answer+='0';
            }
            else if('0' == rsp.charAt(i)){
                answer+='5';
            }
            else if('5' == rsp.charAt(i)){
                answer+='2';
            }
        }
        return answer;
    }
}