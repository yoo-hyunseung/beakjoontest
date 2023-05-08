import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        TreeMap <String, String> hm = new TreeMap<>();
        for(int i =0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if(hm.containsKey(name))
                hm.remove(name);
            else {
                hm.put(name, state);
            }
        }
        List<String> list = new ArrayList<>(hm.keySet());
        Collections.sort(list);
        for(int i = list.size()-1 ; i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}