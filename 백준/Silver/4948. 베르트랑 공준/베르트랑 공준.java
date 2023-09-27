import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static boolean prime[] = new boolean[246913];
    public static int count_arr[] = new int[246913];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        get_prime();
        count_prime();
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0)break;
            sb.append(count_arr[n*2]-count_arr[n]).append('\n');
        }
        System.out.println(sb);
    }
    public static void get_prime(){
        prime[0]=prime[1]=true;
        
        for(int i=2; i<= Math.sqrt(prime.length);i++){
            if(prime[i])continue;
            for(int j = i*i;j<prime.length;j+=i){
                prime[j]=true;
            }
        }
    }
    public static void count_prime(){
        int count =0;
        for(int i=1;i<prime.length;i++){
            if(!prime[i])count ++;
            count_arr[i]=count;
        }
    }
}