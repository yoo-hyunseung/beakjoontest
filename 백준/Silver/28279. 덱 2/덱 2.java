import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(num <= 2){
                int x = Integer.parseInt(st.nextToken());
                if(num == 1){
                    deque.addFirst(x);
                }
                if(num == 2){
                    deque.addLast(x);
                }
            }
            else{
                if(num == 3){
                    if(!deque.isEmpty()){
                        sb.append(deque.pollFirst()).append("\n");
                    } else{
                        sb.append(-1).append("\n");
                    }
                } else if(num ==4){
                    if(!deque.isEmpty()){
                        sb.append(deque.pollLast()).append("\n");
                    } else{
                        sb.append(-1).append("\n");
                    }
                } else if(num ==5){
                    sb.append(deque.size()).append("\n");
                } else if(num ==6){
                    if(!deque.isEmpty()){
                        sb.append(0).append("\n");
                    } else{
                        sb.append(1).append("\n");
                    }
                } else if(num ==7){
                    if(!deque.isEmpty()){
                        sb.append(deque.peekFirst()).append("\n");
                    } else{
                        sb.append(-1).append("\n");
                    }
                } else{
                    if(!deque.isEmpty()){
                        sb.append(deque.peekLast()).append("\n");
                    } else{
                        sb.append(-1).append("\n");
                    }
                }
            }
            
        }
        System.out.println(sb);
    }
}