import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int sum =0;
        for(int i =0 ; i < truck_weights.length;i++){
            int now = truck_weights[i];
            while(true){
                if(q.isEmpty()){
                    q.offer(now);
                    sum+=now;
                    answer++;
                    break;
                } 
                else if(q.size()==bridge_length){
                    sum-=q.poll();
                } else{
                    if(sum+now>weight){
                        q.offer(0);
                        answer++;
                    } else{
                        q.offer(now);
                        answer++;
                        sum+=now;
                        break;
                    }
                }
            }
        }
        return answer+bridge_length;
    }
}