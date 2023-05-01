class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        boolean [] b = new boolean[n+1];
        for(int i =1  ; i<=n ; i++){
            if(n%i == 0){
                b[i] = true;
                count++;
            }
        }
        answer = new int[count];
        int j = 0;
        for(int i = 1 ; i < n+1; i++){
            if(b[i])answer[j++] = i;
        }
        return answer;
    }
}