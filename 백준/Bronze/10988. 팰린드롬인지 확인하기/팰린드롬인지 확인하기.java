import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str1 = "";
        for(int i = str.length()-1; i >=0; i--){
            str1+=str.charAt(i);
        }
        if(str.equals(str1))System.out.println("1");
        else System.out.println("0");
    }
}