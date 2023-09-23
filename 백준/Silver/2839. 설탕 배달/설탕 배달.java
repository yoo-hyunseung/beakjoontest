import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int cnt=0;
        while(true)
        {
            if(t%5==0){
                cnt += t/5;
                System.out.println(cnt);
                break;
            }
            else{
                t-=3;
                cnt++;
            }
            if(t<0){
                System.out.println(-1);
                break;
            }
        }
    }
}