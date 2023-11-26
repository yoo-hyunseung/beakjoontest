class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        int length = start-end_num+1;
        answer = new int[length];
        for(int i = start ; i >=end_num; i--){
            answer[start-i]=i;
        }
        return answer;
    }
}