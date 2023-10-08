import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue <String> card1 = new LinkedList<>(Arrays.asList(cards1));
        Queue <String> card2 = new LinkedList<>(Arrays.asList(cards2));
        for(int i =0 ; i< goal.length;i++){
            String now = goal[i];
            if(!card1.isEmpty() && card1.peek().equals(now)){
                card1.poll();
            } else if(!card2.isEmpty() &&card2.peek().equals(now)){
                card2.poll();
            } else{
                answer = "No";
            }
        }
        return answer;
    }
}