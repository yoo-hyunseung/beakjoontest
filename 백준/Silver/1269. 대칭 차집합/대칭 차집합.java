import java.io.*;
import java.util.*;

public class Main{
    static HashSet<Integer> setA = new HashSet<>();
    static HashSet<Integer> setB = new HashSet<>();
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st= new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < n ; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < m ; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }
        int result = minus(setA, setB) + minus(setB, setA);
        System.out.println(result);
    }
    public static int minus(HashSet a , HashSet b){
        Iterator it = a.iterator();
        int count =0;
        while(it.hasNext()){
            int str = (int)it.next();
            if(!b.contains(str))
                count++;
        }
        return count;
    }
}