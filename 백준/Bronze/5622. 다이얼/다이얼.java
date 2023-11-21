import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = str.length();
        for(int i= 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            if(c<'D')sum+=2;
            else if(c<'G')sum+=3;
            else if(c<'J')sum+=4;
            else if(c<'M')sum+=5;
            else if(c<'P')sum+=6;
            else if(c<'T')sum+=7;
            else if(c<'W')sum+=8;
            else sum+=9;
        }
        System.out.println(sum);
    }
}