class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int [] check = new int[10];
        for(int n = i; n<=j ; n++){
            int num = n;
            while(num!=0){
                check[num%10]++;
                num/=10;
            }
        }
        answer = check[k];
        return answer;
    }
}