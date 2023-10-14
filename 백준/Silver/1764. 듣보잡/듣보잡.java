import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet <String> set = new HashSet<>();
        for(int i =0 ; i<n ; i++){
            set.add(br.readLine());
        } 
        int count =0;
        List<String> result = new ArrayList<>();
        for(int i =0 ; i <m ; i++){
            String name = br.readLine();
            if(!set.add(name)){
                count++;
                result.add(name);
            }
        }
        sb.append(count).append("\n");
        Collections.sort(result);
        for(String s : result){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}