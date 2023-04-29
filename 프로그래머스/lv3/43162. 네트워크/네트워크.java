import java.util.ArrayList;
class Solution {
    static boolean []visited;
    static ArrayList<Integer>[] list;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        list = new ArrayList[n];
        visited = new boolean[n];
        for(int i =0  ;i < n ; i++){
            list[i] = new ArrayList<Integer>();
        }
        for(int i =0 ; i < n;i++){
            for(int j =0 ; j<n ;j++){
                if(i != j && computers[i][j]==1){
                    list[i].add(j);
                    list[j].add(i);
                }
            }
        }
        for(int i =0 ; i< n ;i++){
            if(!visited[i]){
                DFS(i);
                answer++;
            }
        }

        return answer;
    }
    public void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : list[v]){
            if(!visited[i])DFS(i);
        }
    }
}