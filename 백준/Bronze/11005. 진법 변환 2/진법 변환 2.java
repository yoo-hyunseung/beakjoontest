import java.io.*;
import java.util.*;

public class Main{
    static String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        char [] dno = new char[36];
        int count = convert(x,n,dno);
        for(int i =count-1; i >=0;i--){
            sb.append(dno[i]);
        }
        System.out.println(sb);
    }
    static int convert(int x , int n, char[]dno){
        int count=0;
        do{
            dno[count++] = s.charAt(x%n);
            x/=n;
        }while(x!=0);
        return count;
    }
}