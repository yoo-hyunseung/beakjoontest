import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int [] ptr1 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine()," ");
        int [] ptr2 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine()," ");        
        int [] ptr3 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};        
        int x;
        int y;
        if(ptr1[0] == ptr2[0])x=ptr3[0];
        else if(ptr1[0]==ptr3[0])x=ptr2[0];
        else x=ptr1[0];
        
        if(ptr1[1] == ptr2[1])y=ptr3[1];
        else if(ptr1[1]==ptr3[1])y=ptr2[1];
        else y=ptr1[1];
        
        System.out.println(x + " "+ y);
    }
}