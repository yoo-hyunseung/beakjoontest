import java.util.*;
import java.text.SimpleDateFormat;

public class Main{
    public static void main(String[]args){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        StringTokenizer st = new StringTokenizer(sdf.format(date),"-");
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}