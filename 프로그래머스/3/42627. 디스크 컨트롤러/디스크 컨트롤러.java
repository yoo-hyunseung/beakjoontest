import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs,(o1,o2)->{
            return o1[0]-o2[0];
        });
        int index=0;
        int curtime=0;
        PriorityQueue<Disk> pq = new PriorityQueue<>((o1,o2)->{
            return o1.process-o2.process;
        });
        while(index < jobs.length || !pq.isEmpty()){
            while(index<jobs.length && jobs[index][0]<=curtime){
                pq.offer(new Disk(jobs[index][0],jobs[index][1]));
                index++;
            }
            if(pq.isEmpty()){
                curtime = jobs[index][0];
            }
            else{
                Disk d = pq.poll();
                curtime +=d.process;
                answer += curtime-d.request;
            }
        }
        return (int)Math.floor(answer/jobs.length);
    }
}
class Disk{
    int request;
    int process;
    public Disk(int request,int process){
        this.request = request;
        this.process = process;
    }
}