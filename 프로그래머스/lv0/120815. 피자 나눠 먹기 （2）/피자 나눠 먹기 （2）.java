class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = gcd(n,6);
        answer = n/num;
        return answer;
    }
    int gcd(int a, int b){
    
    if(b == 0){
        return a;
    }else{
        return gcd(b, a%b);
    }
}
}