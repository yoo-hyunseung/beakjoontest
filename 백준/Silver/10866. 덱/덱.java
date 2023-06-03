import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        List<Integer> dequeue = new ArrayList<>();
        for(int i =0 ; i < n ; i++){
            String str = br.readLine();
            if(str.contains("push_front")){
                st = new StringTokenizer(str);
                st.nextToken();
                dequeue.add(0,Integer.parseInt(st.nextToken()));
            }
            else if(str.contains("push_back")){
                st = new StringTokenizer(str);
                st.nextToken();
                dequeue.add(Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("pop_front")){
                if(!dequeue.isEmpty()){
                    System.out.println(dequeue.remove(0));
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(str.equals("pop_back")){
                if(!dequeue.isEmpty()){
                    System.out.println(dequeue.remove(dequeue.size()-1));
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(str.equals("size")){
                System.out.println(dequeue.size());
            }
            else if(str.equals("empty")){
                if(dequeue.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(str.equals("front")){
                if(!dequeue.isEmpty()){
                    System.out.println(dequeue.get(0));
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(str.equals("back")){
                if(!dequeue.isEmpty()){
                    System.out.println(dequeue.get(dequeue.size()-1));
                }
                else{
                    System.out.println(-1);
                }
            }
        }
    }
}