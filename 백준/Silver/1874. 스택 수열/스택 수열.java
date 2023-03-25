import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        for(int i =0 ; i < N ; i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stk = new Stack<>();
        int num = 1;
        boolean result = true;
        for(int i =0 ; i < N ; i++){
            int su = A[i];
            if(num <= su){
                while(num<=su){
                    stk.push(num++);
                    sb.append("+").append("\n");
                }
                stk.pop();
                sb.append("-").append("\n");
            }
            else{
                int p = stk.pop();
                if(p > su){
                    System.out.println("NO");
                    result = false; 
                    break;
                }
                else{
                    sb.append("-").append("\n");
                }
            }
        }
        if(result) System.out.println(sb);
    }
}