import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if(M<45){
            H = (H-1+24)%24;
            M = (M-45+60)%60;
        }
        else{
            M-=45;
        }
        System.out.println(H+" "+M);
    }
}