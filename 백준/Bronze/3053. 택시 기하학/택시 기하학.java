import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine());
        double uc = Math.pow(r,2)*Math.PI;
        double taxi = Math.pow(r,2)*2;
        System.out.println(uc);
        System.out.println(taxi);        
        
        
        
    }
}