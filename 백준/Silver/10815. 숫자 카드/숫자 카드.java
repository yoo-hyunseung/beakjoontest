import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
    public static void main (String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int [n];
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0 ;i <n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        int m = Integer.parseInt(br.readLine());        
        int arr2 [] = new int[m];
        st= new StringTokenizer(br.readLine()," ");
        for(int i=0 ; i < m ;i++){
            int target= Integer.parseInt(st.nextToken());
            sb.append(BinSearch(arr,target)).append(" ");
        }
        System.out.println(sb);
        
    }
    public static int BinSearch(int [] arr, int target){
        int first = 0;
        int last = arr.length-1;
        int mid =0;
        while(first <= last){
            mid = (first + last)/2;
            if(arr[mid] == target)return 1;
            if(arr[mid] < target){
                first = mid +1;
            }
            else{
                last = mid-1;
            }
            
        }
        return 0;
    }
}