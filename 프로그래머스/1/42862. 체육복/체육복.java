import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int []move = new int[]{-1,1};
        int [] total = new int[n+1];
        Arrays.fill(total,1);
        for(int i =0 ; i < reserve.length;i++){
            int num = reserve[i];
            total[num] = 2;
        }
        for(int i=0 ; i < lost.length; i++){
            int num = lost[i];
            if(total[num] ==2){
                total[num] =1;
            } else{
                total[num] = 0;
            }
        }
        for(int i =1 ; i < total.length;i++){
            if(total[i]==2){
                for(int j=0; j<2;j++){
                    int next = i+move[j];
                    if(next>=1 && next<total.length){
                        if(total[next]==0){
                            total[next] = 1;
                            total[i]-=1;
                            break;
                            // System.out.println("next = "+next);
                        }
                    }
                }
            }
        }
        for(int i =1 ; i < total.length; i++){
            if(total[i]>=1){
                answer++;
            }
        }
        return answer;
    }
}