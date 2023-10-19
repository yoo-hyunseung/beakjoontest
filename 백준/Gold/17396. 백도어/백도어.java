import java.util.*;
import java.io.*;

public class Main{
    static int []view;
    static long[]dist;
    static boolean check[];
    static ArrayList<Move> graph[];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        view = new int [n];
        graph=new ArrayList[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0 ; i< n;i++){
            view[i] = Integer.parseInt(st.nextToken());
            graph[i] = new ArrayList<>();
        }
        
        
        for(int i =0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            graph[start].add(new Move(end,time));
            graph[end].add(new Move(start,time));
        }
        dijkstra(n,0);
        if(dist[n-1]==Long.MAX_VALUE){
            System.out.println(-1);
        } else{
            System.out.println(dist[n-1]);
        }
        
    }
    public static void dijkstra(int n, int start){
        dist=new long[n];
        check = new boolean[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[start]=0;
        PriorityQueue<Move> pq = new PriorityQueue<>((o1,o2)->{
            return Long.compare(o1.time,o2.time);
        });
        pq.offer(new Move(start,0));
        while(!pq.isEmpty()){
            int now = pq.poll().point;
            if(check[now])continue;
            check[now]=true;
            for(int i =0 ; i < graph[now].size();i++){
                Move next = graph[now].get(i);
                if(next.point != n - 1 && view[next.point]==1) continue;
                if(dist[next.point] > dist[now]+next.time){
                    dist[next.point] = dist[now]+next.time;
                    pq.offer(new Move(next.point,dist[next.point]));
                }
            }
        }
        
    }
}
class Move{
    int point;
    long time;
    public Move(int point,long time){
        this.point = point;
        this.time = time;
    }
}