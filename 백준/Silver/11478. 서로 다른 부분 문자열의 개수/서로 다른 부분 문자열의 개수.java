import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<String> setStr = new HashSet<>();
        for(int i =0 ; i < str.length();i++){
            for(int j =0 ; j<str.length()-i;j++){
                setStr.add(str.substring(j,j+i+1));
            }
        }
        System.out.println(setStr.size());
    }
}