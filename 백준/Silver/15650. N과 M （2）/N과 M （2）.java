import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static int n;
    public static int m;
    public static int [] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int [m];
       
        dfs(0,0);
        System.out.println(sb);
        
    }
    public static void dfs(int at,int depth){
        if(m == depth){
            for(int val : arr){
                sb.append(val).append(" ");
            }
            sb.append('\n');
            return;
        }
        for(int i=at ; i< n ; i++){
            
                arr[depth]= i+1;
                dfs(i+1, depth+1);
            
        }
    }
}

