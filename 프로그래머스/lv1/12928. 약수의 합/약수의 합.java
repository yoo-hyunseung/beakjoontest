class Solution {
    public int solution(int n) {
        int answer = gcdSum(n);
        return answer;
    }
    public static int gcdSum(int n){
        int sum=0;
        for(int i =1 ; i <=n ; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}