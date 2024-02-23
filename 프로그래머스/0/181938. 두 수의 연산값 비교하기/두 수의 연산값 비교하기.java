class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int first = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int second = 2*a*b;
        if(first>=second){
            answer = first;
        } else{
            answer = second;
        }
        return answer;
    }
}