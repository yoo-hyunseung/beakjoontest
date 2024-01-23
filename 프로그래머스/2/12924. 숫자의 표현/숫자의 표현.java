class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i =1 ; i <= n ; i++){
            int result =0;
            int j = i;
            while(result !=n){
                result +=j;
                j++;
                if(result == n)
                    answer++;
                else if(result >n){
                    break;
                }
            }
        }
        return answer;
    }
}