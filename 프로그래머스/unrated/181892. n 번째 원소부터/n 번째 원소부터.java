import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = n-1 ; i< num_list.length;i++){
            list.add(num_list[i]);
        }
        answer = new int [list.size()];
        for(int i =0 ; i < answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}