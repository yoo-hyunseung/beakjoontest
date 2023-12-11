import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        Arrays.sort(arr);
        int count=0;
        for(int i : arr){
            if(i%divisor == 0){
                count++;
            }
        }
        answer = new int[count];
        if(count ==0){
            return answer = new int[] {-1};
        }
        else{
            count=0;
            for(int i : arr){
                if(i%divisor == 0){
                    answer[count++]=i;
                }
            }
        }
        
        
        return answer;
    }
}