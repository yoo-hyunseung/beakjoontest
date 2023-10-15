import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> book = new HashSet<>();
        HashMap<String, Integer> count = new HashMap<>();
        for(int i =0 ; i < n ; i++){
            String word = br.readLine();
            if(word.length()>=m){
                book.add(word);
                if(count.containsKey(word)){
                    count.put(word,count.get(word)+1);
                } else{
                    count.put(word,1);
                }
            }
        }
        List<String> list = new ArrayList<>(book);
        Collections.sort(list,(e1,e2)->{
            if(count.get(e1)==count.get(e2)){
                if(e1.length()==e2.length()){
                    return e1.compareTo(e2);
                } else{
                    return e2.length() - e1.length();
                }
            } else{
                return count.get(e2)-count.get(e1);
            }
        });
        for(String s : list){
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }
}