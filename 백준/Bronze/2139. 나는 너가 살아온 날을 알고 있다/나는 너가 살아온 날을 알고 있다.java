import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int [] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        while(true){
            st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            if(day==0 && month==0 && year==0)
                break;
            int total = 0;
            for(int i =1 ; i < month;i++){
                total+=days[i];
            }
            total +=day;
            if(isYear(year)){
                if(month>2){
                    total+=1;
                }
            }

            System.out.println(total);
        }
    }
    public static boolean isYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }
        return false;
    }
}