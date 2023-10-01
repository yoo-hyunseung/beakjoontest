import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i < n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int index = 1;
        for(int i =0 ; i < n; i ++){
            if(index!=arr[i]){
                if(!stk.isEmpty() && stk.peek()==index){
                    stk.pop();
                    i--;
                    index++;
                } else{
                    stk.push(arr[i]);
                }
            } else{
                index++;
            }
        }
        boolean check = true;
        for(int i=0 ; i < stk.size();i++){
            int peek = stk.pop();
            if(peek==index){
                index++;
            } else{
                check =false;
            }
        }
        if(check){
            System.out.println("Nice");
        } else{
            System.out.println("Sad");
        }
    }
}