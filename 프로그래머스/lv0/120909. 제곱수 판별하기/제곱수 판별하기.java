class Solution {
    public int solution(int n) {
        int answer = 2;
        if(n == Math.pow((int)Math.sqrt(n),2)){
            answer = 1;
        }
        return answer;
    }
}