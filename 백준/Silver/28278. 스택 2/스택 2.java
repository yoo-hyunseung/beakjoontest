import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int stack[] = new int[6];
        Stack<String> stk = new Stack();
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            String str = br.readLine();
            if(str.length()!=1){
                st= new StringTokenizer(str);
                st.nextToken();
                stack[1]++;
                stk.push(st.nextToken());
            }
            else{
                int num = Integer.parseInt(str);
                if(num == 2){
                    if(stack[1]!=0){
                        stack[1]--;
                        sb.append(stk.pop()).append("\n");
                    } else{
                        sb.append(-1).append("\n");
                    }
                }
                if(num == 3){
                    sb.append(stack[1]).append("\n");
                }
                if(num == 4){
                    if(stack[1]==0){
                        sb.append(1).append("\n");
                    } else{
                        sb.append(0).append("\n");
                    }
                }
                if(num == 5){
                    if(stack[1]==0){
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(stk.peek()).append("\n");
                    }
                }
            }

        }
        System.out.println(sb);
    }
}