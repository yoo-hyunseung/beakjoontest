class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 2*(k-1)%numbers.length+1;
        return answer;
    }
}