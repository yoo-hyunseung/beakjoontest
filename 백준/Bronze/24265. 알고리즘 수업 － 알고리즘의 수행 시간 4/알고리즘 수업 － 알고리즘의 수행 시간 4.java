import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = 0L;
        for(long i=1 ; i <n; i++){
            result +=i;
        }
        System.out.println(result);
        System.out.println(2);
    }
}