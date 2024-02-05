import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[]args)throws IOException{
        boolean [] arr = new boolean [2<<25];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()){
            int i = Integer.parseInt(st.nextToken());
            if(!arr[i]){
                sb.append(i).append(" ");
                arr[i]=true;
            }
           
        }
        System.out.println(sb);
    }
}