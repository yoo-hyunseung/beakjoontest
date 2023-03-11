import java.math.BigInteger;
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BigInteger num1 = new BigInteger(st.nextToken());
        BigInteger num2 = new BigInteger(st.nextToken());
        System.out.println(num1.add(num2));
    }
}