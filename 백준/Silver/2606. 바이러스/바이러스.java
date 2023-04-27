import java.util.*;
import java.io.*;

public class Main{
    static int node[][];
    static int check[];
    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        check[start] = 1;
        int count = 0;
        q.offer(start);
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i= 1; i < node.length ;i++){
                if(node[temp][i] == 1 && check[i] !=1){
                    q.offer(i);
                    check[i] = 1;
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        node = new int[n+1][n+1];
        check = new int[n+1];
        for(int i =1; i < m+1; i++){
            st = new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            node[c1][c2] =1;
            node[c2][c1] = 1;
        }
        bfs(1);
    }
    
}