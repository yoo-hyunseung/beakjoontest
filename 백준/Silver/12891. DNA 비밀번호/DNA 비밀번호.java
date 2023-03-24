import java.io.*;
import java.util.*;

public class Main{
    static int myArr[];
    static int checkArr[];
    static int secret;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        myArr = new int [4];
        checkArr = new int[4];
        char A[] = br.readLine().toCharArray();
        secret =0;
        int result = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0 ; i < 4 ; i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) secret++;
        }
        for(int i =0; i < P ; i++){
            Add(A[i]);
        }
        if(secret == 4)result++;
        for(int i = P ; i < S; i++){
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if(secret == 4)result++;
        }
        System.out.println(result);
        
    }
    public static void Add(char c){
        switch(c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0])secret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1])secret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2])secret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3])secret++;
                break;
        }
    }
    public static void Remove(char c){
        switch(c){
            case 'A':
                if(myArr[0] == checkArr[0])secret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1])secret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2])secret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3])secret--;
                myArr[3]--;
                break;
        }
    }
}