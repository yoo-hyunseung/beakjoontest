import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        int index = 0;
        int min = Integer.MAX_VALUE;
        for(int i =0 ; i < arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        // System.out.println("index = "+index);
        if(arr.length == 1){
            answer = new int[] {-1};
        }
        else{
            List<Integer>list = new ArrayList<>();
            for(int i = 0 ; i< arr.length;i++){
                if(arr[i] == min){
                    continue;
                }
                else{
                    list.add(arr[i]);
                }
            }
            answer = new int[arr.length-1];
            for(int i =0 ; i< list.size();i++){
                answer[i] = list.get(i);
            }
        }
        
        
        return answer;
    }
}