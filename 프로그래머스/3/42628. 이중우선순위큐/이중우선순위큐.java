import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> Maxpq = new PriorityQueue<>((o1,o2)->{
            return o2-o1;
        });
        StringTokenizer st;
        for(int i =0 ; i< operations.length;i++){
            st = new StringTokenizer(operations[i]," ");
            String str = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            if(str.equals("I")){
                pq.offer(num);
                Maxpq.offer(num);
            } else if(str.equals("D")){
                if(!pq.isEmpty() && !Maxpq.isEmpty()){
                    if(num<0){
                        int min = pq.poll();
                        Maxpq.remove(min);
                    } else{
                        int max = Maxpq.poll();
                        pq.remove(max);
                    }
                }
            }
        }
        if(!pq.isEmpty() && !Maxpq.isEmpty()){
            answer = new int[] {Maxpq.peek(),pq.peek()};
        } else{
            answer = new int[] {0,0};
        }
        return answer;
    }
}