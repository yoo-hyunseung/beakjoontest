import java.util.*;
import java.text.SimpleDateFormat;
public class Main{
    public static void main(String[]args){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        System.out.println(sdf.format(date));
    }
}