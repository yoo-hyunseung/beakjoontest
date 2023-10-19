import java.io.*;
import java.util.*;

public class Main{
    static int food[];
    static boolean check [];
    static ArrayList<Node> graph[];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph= new ArrayList[n+1];
        for(int i =0 ; i< graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i =0; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            // 양 방향
            graph[start].add(new Node(end,cost));
            graph[end].add(new Node(start,cost));
        }
        dijkstra(n,1);
        System.out.println(food[n]);
    }
    public static void dijkstra(int n, int start){
        food=new int[n+1];
        check = new boolean[n+1];
        Arrays.fill(food,Integer.MAX_VALUE);
        food[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2)->{
            return Integer.compare(o1.cost,o2.cost);
        });
        pq.offer(new Node(start,0));
        while(!pq.isEmpty()){
            int now = pq.poll().index;
            if(check[now])continue;
            check[now] = true;
            for(int i =0 ; i< graph[now].size();i++){
                Node next = graph[now].get(i);
                if(food[next.index]>food[now]+next.cost){
                    food[next.index]=food[now]+next.cost;
                    pq.offer(new Node(next.index,food[next.index]));
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
        this.cost=cost;
    }
}