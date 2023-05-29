import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int j = 1;
        long result =0l;
        for(long i = n-2 ; i >=1;i--){
            result += i*j;
            j++;
        }
        System.out.println(result);
        System.out.println(3);
    }
}