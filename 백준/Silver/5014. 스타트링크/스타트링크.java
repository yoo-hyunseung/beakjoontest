import java.util.*;
import java.io.*;

public class Main{
    static int visit[];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        visit = new int [F+1];
        bfs(F,S,G,U,D);
    }
    static void bfs(int F, int S, int G, int U, int D){
        Queue <Integer>q = new LinkedList<>();
        q.offer(S);
        visit[S] = 1;
        while(!q.isEmpty()){
            int c = q.poll();
            if(c == G){
                System.out.println(visit[c] -1);
            }
            if(c + U <= F && visit[c+U] == 0){
                visit[c+U] = visit[c]+1;
                q.offer(c+U);
            }
            if(c-D > 0 && visit[c-D] ==0){
                visit[c-D] = visit[c]+1;
                q.offer(c-D);
            }
        }
        if(visit[G] ==0){
            System.out.println("use the stairs");
        }
    }
}