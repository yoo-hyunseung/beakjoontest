import java.util.*;
import java.io.*;

public class Main{
    static int n;
    static int k;
    static int time[] = new int[100001];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        BFS(n);
        System.out.println(time[k]);
    }
    public static void BFS(int start){
        Queue <Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int now = queue.poll();
            for(int i =0 ; i < 3 ; i++){
                int next = 0;
                if(i==0){
                    next = now - 1;
                }
                else if(i == 1){
                    next = now + 1;
                }
                else {
                    next= now * 2;
                }
                
                if(next >=0 && next <100001 && time[next] ==0 ){
                    time[next] = time[now]+1;
                    queue.add(next);
                }
                if(now == k){
                    return;
                }
            }
        }
    }
}