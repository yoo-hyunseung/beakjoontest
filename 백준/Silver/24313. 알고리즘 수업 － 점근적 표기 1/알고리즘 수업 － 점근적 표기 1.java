import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a0 = Integer.parseInt(st.nextToken());
        int a1 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        // a0 * n0 + a1 <= c * n0
        int result = (a0 * n0 + a1 <= c * n0) && c>=a0 ? 1:0;
        System.out.println(result);
    }
}