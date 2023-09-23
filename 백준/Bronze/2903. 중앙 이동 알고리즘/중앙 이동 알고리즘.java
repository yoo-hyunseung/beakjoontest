import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 2;
        for(int i = 0 ; i < n ;i++){
            m+=m-1;
        }
        System.out.println((int)Math.pow(m,2));
    }
}