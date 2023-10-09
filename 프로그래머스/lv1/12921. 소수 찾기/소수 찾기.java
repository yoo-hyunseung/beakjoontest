class Solution {
    static boolean []prime;
    public int solution(int n) {
        int answer = 0;
        prime = new boolean [n+1];
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(prime[i]){
                continue;
            } 
            for(int j = i*i ; j < prime.length ; j+=i){
                prime[j] =true;
            }
        }
        for(int i =2 ; i < prime.length;i++){
            if(!prime[i]){
                answer++;
            }
        }
        return answer;
    }
}