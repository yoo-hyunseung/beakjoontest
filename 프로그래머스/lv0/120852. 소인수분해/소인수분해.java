class Solution {
    public int[] solution(int n) {
        boolean []bCheck = new boolean[n+1];
        int[] answer = {};
        int count =0;
        for(int i =2 ; i <= n ; i++){
            if(n%i == 0){
                bCheck[i] = true;
                if(!isPrime(i))bCheck[i] = false;
            }
            if(bCheck[i]){
                count++;
            }
        }
        answer = new int[count];
        int j = 0;
        for(int i =0 ; i < bCheck.length;i++){
            if(bCheck[i]){
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
    public boolean isPrime(int num){
        for(int i =2 ; i <=(Math.sqrt(num));i++){
            if(num%i ==0)
                return false;
        }
        return true;
    }
}