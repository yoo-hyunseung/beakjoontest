import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        StringTokenizer st2;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()); // 자료구조
        st2 = new StringTokenizer(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i =0 ; i < n ; i++){
            int str = Integer.parseInt(st.nextToken());
            int val = Integer.parseInt(st2.nextToken());
            if(str==0){
                deque.add(val);
            }
        }
        int m = Integer.parseInt(br.readLine());
        String C = br.readLine();  // in
        if(deque.isEmpty()){ // 전체가 stack 일때
            System.out.println(C);
        } else{
            st = new StringTokenizer(C);
            for(int i=0 ; i<m ; i++){
                deque.addFirst(Integer.parseInt(st.nextToken()));
                sb.append(deque.pollLast()+" ");
            }
        }
        System.out.println(sb);
    }
}