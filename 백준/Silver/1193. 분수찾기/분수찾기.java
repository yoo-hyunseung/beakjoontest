import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int i=1;
        int cnt=0;
        while(n>0){
            n-=i;
            i++;
            cnt++;
        }
        if(cnt%2 ==0){
            System.out.println((cnt+n)+"/"+(1-n));
        }
        else{
            System.out.println((1-n)+"/"+(cnt+n));
        }
    }
}