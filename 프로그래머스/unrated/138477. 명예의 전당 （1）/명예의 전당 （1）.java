import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        
        int days = score.length;
        answer = new int[days];
        List<Integer> rank = new ArrayList<>();
        for(int i =0  ; i< days;i++){
            rank.add(score[i]);
            Collections.sort(rank,Collections.reverseOrder());
            if(i<k){
                answer[i] = rank.get(i);
            } else{
                answer[i] = rank.get(k-1);
            }
        }
        return answer;
    }
}