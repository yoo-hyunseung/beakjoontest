import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue <Integer> q = new LinkedList<>();
        List <Integer> list = new ArrayList<>();
        for(int i = 0 ; i < progresses.length;i++){
            int days = (int)(Math.ceil((100-progresses[i])/(double)speeds[i]));
            q.offer(days);
        }
        int now = q.peek();                     
        int count =0;
        while(!q.isEmpty()){
            if(now >=q.peek()){
                q.poll();
                count++;
            }
            else if(now < q.peek()){
                list.add(count);
                now = q.peek();
                count=0;
            }
        }
        list.add(count);
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}