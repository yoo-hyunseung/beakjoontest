class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int mul = 1;
        for(int i = 0; i < box.length; i++){
            mul*=((box[i]/n)*n);
        }
        answer = mul/(n*n*n);
        return answer;
    }
}