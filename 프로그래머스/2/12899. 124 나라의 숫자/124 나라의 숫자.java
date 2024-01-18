class Solution {
    public String solution(int n) {
        String answer = "";
        int num[] = new int [] {4,1,2};
        StringBuilder sb = new StringBuilder();
        while(true){
            sb.append(num[n%3]);
            
            if(n%3==0){
                n/=3;
                n-=1;
            }
            else{
                n/=3;
            }
            if(n==0)break;
            
        }
        System.out.println(sb.reverse());
        return answer=sb.toString();
    }
}