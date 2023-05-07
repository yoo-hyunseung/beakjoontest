
import java.util.*;
import java.io.*;

public class Main{
    static int F,G,S,U,D;
    static int count[];

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        count = new int[F+1];
        BFS(S);
        if(count[G] == 0){
            System.out.println("use the stairs");
        }
        else{
            System.out.println(count[G]-1);
        }


    }
    public static void BFS(int n){
        Queue <Integer> queue = new LinkedList<>();
        queue.offer(n);
        count[n] = 1;
        while(!queue.isEmpty()){
            int now = queue.poll();
            if(now == G)return;
            if(now + U <= F && count[now+U] ==0){
                count[now+U] = count[now]+1;
                queue.offer(now+U);
            }
            if(now - D > 0 && count[now-D] == 0){
                count[now-D] = count[now]+1;
                queue.offer(now-D);
            }
        }
    }
}