import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet <String> set = new HashSet<>();
        for(int i =0 ; i < str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                String s = str.substring(i,j);
                if(!set.contains(s))
                    set.add(s);
            }
        }
        System.out.println(set.size());
    }
}