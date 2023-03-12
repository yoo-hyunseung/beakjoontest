import java.io.*;

public class Main{
    static int code1 = 0;
    static int code2 = 0;
    static int[] arr = new int [41];
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo(n);
        fibo2(n);
        System.out.println(code1 + " "+ code2);
    }
    public static int fibo(int n){
        if(n ==1 || n == 2){
            code1++;
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void fibo2(int n){
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3 ; i <= n ; i++){
            arr[i] = arr[i-2] + arr[i-1];
            code2++;
        }
    }
}