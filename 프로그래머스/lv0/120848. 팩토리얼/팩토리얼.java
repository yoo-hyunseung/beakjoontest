class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =1  ; i <= 10 ; i++){
            int result = fatorial(i);
            if(result > n){
                answer = i-1;
                break;
            }
            else if(result == n){
                answer = i;
                break;
            }
        }
        return answer;
    }
    public int fatorial(int i){
        if(i <= 1)return 1;
        else return i*fatorial(i-1);
    }
}