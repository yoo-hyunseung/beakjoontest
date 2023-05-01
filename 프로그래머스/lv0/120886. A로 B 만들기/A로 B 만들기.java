class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int be[] = new int[26];
        int af[] = new int[26];
        for(int i = 0 ; i < before.length();i++){
            be[(int)before.charAt(i)%97]++;
            af[(int)after.charAt(i)%97]++;
        }
        for(int i = 0 ; i < be.length;i++){
            if(be[i] != af[i])answer =0;
        }
        return answer;
    }
}