import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());        
        if((a+b+c) == 180){
            if(a==b){
                if(b==c){
                    System.out.println("Equilateral");
                }
                else {
                    System.out.println("Isosceles");
                }
            }
            else if(b==c){
                if(c==a){
                    System.out.println("Equilateral");
                }
                else {
                    System.out.println("Isosceles");
                }
            }
            else if(c==a){
                if(b==a){
                    System.out.println("Equilateral");
                }
                else{
                    System.out.println("Isosceles");
                }
            }
            else{
                System.out.println("Scalene");
            }
        }
        else {
            System.out.println("Error");
        }
    }
}