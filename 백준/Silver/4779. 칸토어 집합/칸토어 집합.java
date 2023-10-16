import java.io.*;
import java.util.*;

public class Main{
    static StringBuilder sb;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine())!=null) {
            int n = Integer.parseInt(str);
            int length = (int) Math.pow(3, n);
            sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append("-");
            }
            recur(0, length);
            System.out.println(sb);
        }
    }
    public static void recur(int start, int size){
        if(size ==1){
            return;
        }
        int newSize = size/3;
        for(int i =start+newSize; i< start+(2*newSize); i++){
            sb.setCharAt(i,' ');
        }
        recur(start,newSize);
        recur(start + (2 * newSize), newSize);
    }
}