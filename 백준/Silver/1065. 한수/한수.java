import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println(isHan(Integer.parseInt(br.readLine())));
        
        
    }
    public static int isHan(int n){
        int count = 0;
        if(n <100){
            return n;
            
        }
        else {
            count = 99;
            if(n == 1000)
                n = 999;
        }
        for(int i= 100 ; i <=n; i++){
            int a = i/100;
            int b = (i/10)%10;
            int c = i%10;
            if(a-b == b-c)count++;
            
            
        }
        return count;
    }
}