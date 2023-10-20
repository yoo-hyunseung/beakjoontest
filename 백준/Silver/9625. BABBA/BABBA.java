import java.io.*;
import java.util.*;

public class Main{
    static int dpB[] = new int[46];
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        int k = Integer.parseInt(br.readLine());
        dpB[0] = 0;
        dpB[1] = 1;
        for(int i =2; i<46;i++){
            dpB[i] = dpB[i-1]+dpB[i-2];
        }
        sb.append(dpB[k-1]+" "+dpB[k]);
        System.out.println(sb);
    }
    
}

