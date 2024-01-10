import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i =0 ; i < tangerine.length; i++){
            count.put(tangerine[i], count.getOrDefault(tangerine[i],0)+1);
        }
        List<Integer> list = new ArrayList<>(count.values());
        Collections.sort(list,Collections.reverseOrder());
        int sum = 0;
        for(int i : list){
            System.out.print(i+" ");
            sum+=i;
            answer++;
            if(sum>=k){
                break;
            }
        }
        return answer;
    }
}