import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sum = 0.0;
        double total = 0.0;
        for(int i=0 ;i < 20 ; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double num = Double.parseDouble(st.nextToken());
            total += num;
            String score = st.nextToken();
            if(score.equals("A+")){
                sum += (num*4.5);
            }
            else if(score.equals("A0")){
                sum += (num*4.0);
            }
            else if(score.equals("B+")){
                sum += (num*3.5);
            }
            else if(score.equals("B0")){
                sum += (num*3.0);
            }
            else if(score.equals("C+")){
                sum += (num*2.5);
            }
            else if(score.equals("C0")){
                sum += (num*2.0);
            }
            else if(score.equals("D+")){
                sum += (num*1.5);
            }
            else if(score.equals("D0")){
                sum += (num*1.0);
            }
            else if(score.equals("F")){
                sum += (num*0.0);
            }
            else{
                total-=num;
            }
        }
        System.out.println(sum/total);
    }
}