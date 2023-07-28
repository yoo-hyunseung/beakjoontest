import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner stdIn = new Scanner(System.in);
        while(stdIn.hasNextInt()){
            int x = stdIn.nextInt();
            int y = stdIn.nextInt();
            System.out.println(x+y);
        }
    }
    
}