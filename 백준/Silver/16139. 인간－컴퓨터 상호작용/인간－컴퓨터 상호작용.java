import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str = br.readLine();
        int [][] countChar = new int [str.length()+1][26];
        
        for(int i=0 ; i < str.length();i++){
            for(int j = 0 ; j<26;j++){
                countChar[i+1][j] = countChar[i][j];
            }
            char c = str.charAt(i);
            countChar[i+1][c-'a']++;
        }
        
        int q = Integer.parseInt(br.readLine());
        for(int i=0 ; i<q ; i++){
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int charIndex = c-'a';
            int start = Integer.parseInt(st.nextToken())+1;
            int end = Integer.parseInt(st.nextToken())+1;
            sb.append(countChar[end][charIndex]-countChar[start-1][charIndex]).append("\n");
        }
        System.out.println(sb);
    }
}