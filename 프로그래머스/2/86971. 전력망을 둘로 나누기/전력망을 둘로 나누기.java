import java.util.*;
class Solution {
    static boolean visited[];
    static int [][]graph;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        graph = new int [n+1][n+1];
        visited = new boolean[n+1];
        // graph 초기화
        for(int i =0 ; i < wires.length;i++){
            int start = wires[i][0];
            int end = wires[i][1];
            graph[start][end] = 1;
            graph[end][start] = 1;
        }
        for(int i =1 ; i< n+1;i++){
            for(int j = 1; j < n+1; j++){
                if(graph[i][j]==0)continue;
                else{
                    // 연결 끊기
                    graph[i][j] = 0;
                    int count = BFS(i);
                    System.out.println("start = "+i +" "+count);
                    answer = Math.min(Math.abs(n-count-count),answer);
                    graph[i][j] = 1;
                    visited = new boolean[n+1];
                }
            }
        }
        return answer;
    }
    
    public static int BFS(int start){
        visited[start] =true;
        int count =1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            int now = q.poll();
            for(int i =1 ; i <graph[now].length;i++){
                if(graph[now][i]==1){
                    int next = i;
                    if(!visited[i]){
                        visited[i] =true;
                        q.offer(i);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}