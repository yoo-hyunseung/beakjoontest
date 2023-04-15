import java.util.*;
class Solution {
    public int solution(int[] array) {
        int count [] = new int[1000];
        int answer = 0;
        for(int i =0 ;i <array.length; i++){
            count[array[i]]++;
        }
        int max=0;
        int index =0;
        for(int i = 0 ;i < count.length; i++){
            if(max <count[i]){
                max = count[i];
                index = i;
            }            
        }
        int num=0;
        for(int i=0 ; i < count.length; i++){
            if(max == count[i]){
                num = i;
            }
        }
        if(num != index)answer = -1;
        else answer = index;
        
        
        
        return answer;
    }
}