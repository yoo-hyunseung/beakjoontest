import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        ArrayList<String>list = new ArrayList<>();
        
        for(int i = 0 ; i<n;i++){
            set.add(br.readLine());
        }
        for(int i = 0 ; i<m;i++){
            String str = br.readLine();
            if(set.contains(str)){
                list.add(str);
            }
        }
        Collections.sort(list);
        sb.append(list.size()).append('\n');
        for(String s : list){
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}