import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static boolean prime[];
    public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        prime = new boolean[m+1];
        get_prime();
        for(int i=n;i<=m;i++){
            if(prime[i]==false)
                System.out.println(i);
        }
    }
    public static void get_prime(){
        prime[0]=true;
        prime[1]=true;
        for(int i =2;i<Math.sqrt(prime.length);i++){
            if(prime[i]==true)continue;
            for (int j = i*i; j<prime.length; j+=i){
                prime[j]=true;
                
            }
        }
    }
}