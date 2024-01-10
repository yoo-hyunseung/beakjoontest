import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> sum = new HashSet<>();
        for(int i =1 ; i <= elements.length;i++){
            for(int j = 0 ; j < elements.length;j++){
                int total=0;
                for(int k = j ; k < j+i;k++){
                    total += elements[k%elements.length];
                }
                sum.add(total);
            }
        }
        answer = sum.size();
        return answer;
    }
}