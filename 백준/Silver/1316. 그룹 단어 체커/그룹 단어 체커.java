import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args)throws IOException{
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<n ;i++)
        {
            if(check() == true)count++;
        }        
        System.out.println(count);
    }
    public static boolean check()throws IOException{
        boolean [] check  = new boolean[26];
        int pre =0;
        String str = br.readLine();
        for(int i=0; i<str.length();i ++){
            int now = str.charAt(i);
            if(pre != now){
                if(check[now-'a']==false){
                    check[now-97]=true;
                    pre = now;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    
}