import java.util.*;
import java.io.*;

public class Main{
    
   static int dist[]; // 거리 배열
    static boolean check[]; // 방문확인
    static LinkedList<Node>[] graph;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        graph = new LinkedList[n+1];
        for(int i =0 ; i<= n ; i++){
            graph[i] = new LinkedList<>();
        }
        for(int i =0 ; i< m ; i++){
            st= new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int cost =1 ;
            int w = Integer.parseInt(st.nextToken());
            graph[v].add(new Node(w,cost));
        }
        dijkstra(n,start);
        for(int i =1 ; i< dist.length;i++){
            if(dist[i]==k){
                sb.append(i).append("\n");
            }
        }
        if(sb.toString().equals("")){
            sb.append(-1);
        }
        System.out.println(sb);
    }
    public static void dijkstra(int n , int start){
        dist = new int[n+1];
        check = new boolean[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o1.cost, o2.cost);
        });
        pq.offer(new Node(start,0));
        while(!pq.isEmpty()){
            int nowV = pq.poll().index;
            if(check[nowV])continue;
            check[nowV]=true;

            for(int i =0 ; i < graph[nowV].size();i++){
                Node next = graph[nowV].get(i);
                if(dist[next.index]>dist[nowV]+next.cost){
                    dist[next.index] = dist[nowV]+next.cost;
                    pq.add(new Node(next.index,dist[next.index]));
                }
            }
        }
        for(int i =0 ; i< dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE){
                dist[i]=0;
            }
        }
    }
}
class Node{
    int index;
    int cost;
    public Node(int index, int cost){
        this.index = index;
        this.cost = cost;
    }
}