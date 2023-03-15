import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[]args)throws IOException{
        int []cnt = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i =0; i<n ;i++){
            cnt[Integer.parseInt(br.readLine())]++;            
        }
        for(int i =0; i< cnt.length; i++){
            while(cnt[i]>0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}