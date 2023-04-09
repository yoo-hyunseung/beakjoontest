import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int i =0 ; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            stk.push(num);
        }
        int count=1;
        int first = stk.pop();
        while(!stk.isEmpty()){
            int now = stk.pop();
            if(first < now){
                count++;
                first = now;
            }
        }
        System.out.println(count);
    }
}