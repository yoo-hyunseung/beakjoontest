import java.io.*;
import java.util.*;

public class Main{
    static long start,end;
    static int count;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Long.parseLong(st.nextToken());
        end = Long.parseLong(st.nextToken());
        System.out.println(BFS(start));
    }
    public static int BFS(long s){
        Queue <Long> queue = new LinkedList<>();
        queue.offer(s);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i =0  ; i < size;i++){
                long now = queue.poll();
                long mul = now*2;
                long plus = now*10+1;
                if(mul <= end){
                    queue.offer(mul);
                }
                if(plus <= end){
                    queue.offer(plus);
                }
                if(now == end)return count+1;
            }
            count++;
        }
        return -1;
    }
}