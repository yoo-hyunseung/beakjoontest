import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count =0;
        String log = br.readLine();
        HashSet<String> set = new HashSet<>();
        for(int i =0 ; i < n-1 ; i++){
            log = br.readLine();
            if(log.equals("ENTER")){
                count+=set.size();
                set.clear();
            }
            else{
                set.add(log);
            }
        }
        count+=set.size();
        System.out.println(count);
    }
}