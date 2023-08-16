import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int n =1;
        int count =0;
        if(N ==1)System.out.println(1);
        else{
            N-=1;
            while(N>0){
                N -=(n*6);
                n++;
                count++;
            }
            System.out.println(count+1);
        }
    }
    
}