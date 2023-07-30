import java.util.Scanner;
import java.util.StringTokenizer;
public class Main{
    public static void main(String [] args){
        Scanner stdIn = new Scanner (System.in);
        String s = stdIn.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        System.out.println(st.countTokens());
        }
}