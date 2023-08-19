import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[8001];//입력값의 범위 -4000 ~ 4000
        int sum =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 10000;
        int mode = 10000;
        for(int i=0; i<n; i++){
            int value = Integer.parseInt(br.readLine());
            sum+=value;
            arr[4000+value]++;
            if(max<value)max=value;
            if(min>value)min=value;
        }
        int count =0;
        int mode_max =0;
        boolean flag =false;
        for (int i = min+4000; i<=max+4000; i++){
            if(arr[i]>0){
                if(count < (n+1)/2){
                    count+=arr[i];
                    median = i-4000;
                }
                
                if(mode_max < arr[i]){
                    mode_max = arr[i];
                    mode = i-4000;
                    flag = true;
                }
                else if(mode_max == arr[i] && flag == true){
                    mode = i-4000;
                    flag = false;
                }
            }
        }
        System.out.println((int)Math.round((double)sum / n));	// 산술평균 
		System.out.println(median);	// 중앙값 
		System.out.println(mode);	// 최빈값 
		System.out.println(max - min);	// 범위 
    }
}