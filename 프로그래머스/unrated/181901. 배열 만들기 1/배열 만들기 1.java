class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        answer= new int[(int)(n/k)];
        int index=0;
        for(int i =k ; i <=n;i+=k){
            answer[index++] =i;
        }
        return answer;
    }
}