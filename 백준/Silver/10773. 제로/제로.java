import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    

    public static void main(String[]args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int []stack = new int[k];
        int top = -1;
        int sum =0;
        for(int i =0; i< k ; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                top--;
            }
            else{
                top++;
                stack[top] = n;
            }
        }
        for(int i=0 ; i<= top;i++){
            sum +=stack[i];
        }
        System.out.println(sum);
    }
}