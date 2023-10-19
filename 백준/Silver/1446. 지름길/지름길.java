import java.io.*;
import java.util.*;

public class Main{
    static int[] dist;
    static int total;
    static LinkedList<Node1> graph[];
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        total = Integer.parseInt(st.nextToken());
        graph = new LinkedList[total+1];
        dist = new int[total+1];
        for(int i =0 ; i < graph.length;i++){
            graph[i] = new LinkedList<>();
            dist[i] = i; // 고속도로 타는 거리 초기화
        }
        for(int i =0  ; i<n ;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            if(index<=total){
                graph[start].add(new Node1(index,cost));
            }
        }
        dijkstra(0);
        System.out.println(dist[total]);
    }
    public static void dijkstra(int start){
        if(start>=total){
            return;
        }
        if(dist[start+1] > dist[start]+1){ // 고속도로가 더 빠를때
            dist[start+1]=dist[start]+1;
        }
        for(int i=0 ; i < graph[start].size();i++){
            if(graph[start].get(i).cost+dist[start] < dist[graph[start].get(i).index]){
                dist[graph[start].get(i).index] = graph[start].get(i).cost+dist[start]; // 이전 값과 지름길 합
            }
        }
        dijkstra(start+1);
    }
}
class Node1 {
    int index;
    int cost;
    public Node1(int index, int cost){
        this.index = index;
        this.cost = cost;
    }
}