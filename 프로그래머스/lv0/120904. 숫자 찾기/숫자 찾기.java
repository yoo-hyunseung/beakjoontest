class Solution {
    public int solution(int num, int k) {
        int answer = (String.valueOf(num)).indexOf(String.valueOf(k));
        answer = answer != -1 ? answer+1 : -1;
        
        return answer;
    }
}