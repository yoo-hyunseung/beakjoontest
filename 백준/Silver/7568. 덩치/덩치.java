import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int [][] arr = new int[T][2];
        
        for(int i =0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());            
        }
        for(int i=0;i<T;i++){
            int count =0;
            for(int j = 0;j<T;j++){
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]){
                    count++;
                }
            }
            sb.append(count+1).append(" ");
        }
        System.out.println(sb);
    }
}