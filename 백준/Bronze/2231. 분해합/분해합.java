import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int result=0;
        for(int i=1; i< M;i++){
            int sum = 0;
            int n = i;
            while(n!=0){
                sum+= n%10;
                n/=10;
            }
            if(sum+i == M){
                result =i;
                break;
            }
            else result = 0;
        }
        System.out.println(result);
    }
}