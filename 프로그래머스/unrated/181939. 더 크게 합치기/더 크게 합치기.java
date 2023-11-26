class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int first = 0;
        int second = 0;
        first = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        second = Integer.parseInt(String.valueOf(b)+String.valueOf(a));
        if(first>second){
            answer = first;
        } else{
            answer = second;
        }
        return answer;
    }
}