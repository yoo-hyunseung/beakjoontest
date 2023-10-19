import java.util.*;
import java.io.*;

public class Main{
    
    static int dist[];
    static boolean []check;
    static ArrayList<Node> graph[];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n+1];
        for(int i =0 ; i < graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        // 그래프 초기화
        for(int i =0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[start].add(new Node(end,cost));
            graph[end].add(new Node(start,cost));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        
        dijkstra(n,start);
        
        System.out.println(dist[end]);
    }
    public static void dijkstra(int n,int start){
        dist = new int [n+1];
        check = new boolean [n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start]=0;
        PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2)->{
            return Integer.compare(o1.cost,o2.cost);
        });
        pq.offer(new Node(start,0));
        while(!pq.isEmpty()){
            int now = pq.poll().index;
            
            //방문한 노드면
            if(check[now])continue;
            
            check[now] = true;
            
            for(int i =0 ; i < graph[now].size();i++){
                Node next = graph[now].get(i);
                if(dist[next.index]>dist[now]+next.cost){
                    dist[next.index] = dist[now]+next.cost;
                    pq.offer(new Node(next.index,dist[next.index]));
                }
            }
            
        }
    }
}

class Node{
    int index;
    int cost;
    public Node(int index,int cost){
        this.index = index;
        this.cost = cost;
    }
}