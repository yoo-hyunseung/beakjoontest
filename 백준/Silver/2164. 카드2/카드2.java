import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i= 1 ; i <= n; i++){
            q.add(i);
        }
        while(q.size() > 1){
            q.poll();
            int num = q.poll();
            q.add(num);
        }
        System.out.println(q.poll());
    }
}