import java.util.*;
import java.io.*;

public class Main{
    static int dist[];
    static boolean check[];
    static ArrayList<Bus> graph[];
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n+1];
        for(int i =0 ; i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i =0 ; i< m ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[start].add(new Bus(end,cost));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        dijkstra(n,start,end);
        System.out.println(dist[end]);

    }
    public static void dijkstra(int n , int start,int end){
        dist = new int[n+1];
        check = new boolean[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<Bus> pq = new PriorityQueue<>((o1, o2)->{
            return Integer.compare(o1.cost,o2.cost);
        });
        pq.offer(new Bus(start,0));
        while(!pq.isEmpty()){
            int now = pq.poll().arrive;
            if(now==end)return;
            if(check[now])continue;
            check[now] = true;
             for(int i =0 ; i < graph[now].size();i++){ // 연결된 것들 for문
                Bus next = graph[now].get(i);
                if(dist[next.arrive] > dist[now]+next.cost){
                    dist[next.arrive] = dist[now]+next.cost;
                    pq.offer(new Bus(next.arrive,dist[next.arrive]));
                    // next.arrive => 다음 while문에 int now = pq.poll().arrive 가 된다.
                }

            }
        }
    }
}
class Bus{
    int arrive;
    int cost;
    public Bus(int arrive,int cost){
        this.arrive = arrive;
        this.cost = cost;
    }
}
