import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int [] arr = new int[n];
        int [] sorted = new int [n];
        HashMap <Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0 ; i< n ;i++){
            arr[i]=sorted[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);
        
        int rank =0;
        for(int v : sorted){
            if(!rankingMap.containsKey(v)){
                rankingMap.put(v,rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        
        for(int key : arr){
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(" ");
        }
        System.out.println(sb);
    }
}