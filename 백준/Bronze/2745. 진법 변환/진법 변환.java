import java.io.*;
import java.util.*;

public class Main{
    static String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int result=0;
        for(int i=0; i <str.length();i++){
            int num = indexNum(str.charAt(str.length()-1-i));
            result += (num*Math.pow(n,i));
        }
        System.out.println(result);
    }
    public static int indexNum(char c){
        for(int i =0 ; i < s.length();i++){
            if(c == s.charAt(i))return i;
        }
        return -1;
    }
}