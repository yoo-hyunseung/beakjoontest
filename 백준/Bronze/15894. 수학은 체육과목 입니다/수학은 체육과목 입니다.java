import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long result = n*4;
        System.out.println(result);
    }
}