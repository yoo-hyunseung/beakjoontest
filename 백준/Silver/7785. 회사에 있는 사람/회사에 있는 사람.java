import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        HashMap <String, String> hashmap = new HashMap<>();
        for(int i =0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            hashmap.put(name,state);
            if(hashmap.get(name).equals("leave")){
                hashmap.remove(name);
            }
        }
        List<String> list = new ArrayList<>(hashmap.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for(String s : list){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}