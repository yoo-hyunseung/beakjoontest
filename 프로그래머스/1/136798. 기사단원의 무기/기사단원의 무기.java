class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int common[] = new int [number+1];
        for(int i = 1 ; i < common.length ; i ++){
            common[i] = countCommon(i);
            if(common[i]>limit){
                answer+=power;
            } else{
                answer+=common[i];
            }
        }
        for(int i =1 ; i < common.length;i++){
            System.out.print(" "+common[i]);
        }
        return answer;
    }
    public static int countCommon(int n){
        if(n < 2)return 1;
        int count=0;
        for(int i =1 ; i <= Math.sqrt(n) ; i++){
            if(n%i==0){
                count++;
                if(i!=n/i){
                    count++;
                }
            }
        }
        return count;
    }
}