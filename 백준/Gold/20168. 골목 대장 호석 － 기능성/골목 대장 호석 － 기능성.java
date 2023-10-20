import java.io.*;
import java.util.*;

public class Main{
    
    static ArrayList<Node> graph[];
    
    static ArrayList<Node>dist[];
    static boolean check[];
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n+1];
        for(int i =0 ; i < n+1; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i =0 ; i < m ; i++){
            st=new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[start].add(new Node(end,cost));
            graph[end].add(new Node(start,cost));
        }
        dijkstra(n,a);
        Node arr = dist[b].get(0);
        if(arr.index==Integer.MIN_VALUE || arr.cost>c){
            System.out.println(-1);
        } else{
            System.out.println(arr.cost);
        }
    }
    public static void dijkstra(int n , int start){
        dist = new ArrayList[n+1];
        check = new boolean[n+1];
        for(int i = 0 ; i < n+1;i++){
            dist[i] = new ArrayList<>();
            dist[i].add(new Node(Integer.MIN_VALUE, Integer.MAX_VALUE));
            // 최대 비용과, 그 경로 최솟값
        }
        dist[start].set(0,new Node(0,Integer.MAX_VALUE));
        PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2)->{
            return Integer.compare(o2.cost,o1.cost);
        });
        pq.add(new Node(start,0));
        while(!pq.isEmpty()){
            int now = pq.poll().index;
            if(check[now])continue;
            check[now] =true;
            for(int i =0 ; i < graph[now].size();i++){
                Node next = graph[now].get(i);
                if(dist[next.index].get(0).index<dist[now].get(0).index+next.cost){
                    dist[next.index].get(0).index=dist[now].get(0).index+next.cost;
                    if(dist[next.index].get(0).cost > next.cost){
                        dist[next.index].get(0).cost = next.cost;
                    }
                    pq.offer(new Node(next.index,dist[next.index].get(0).index));
                }
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