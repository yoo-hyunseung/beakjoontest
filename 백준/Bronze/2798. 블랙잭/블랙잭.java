import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static int [] arr;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        arr = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i< n; i++){            
            arr[i]=Integer.parseInt(st1.nextToken());
        }
        int result = search(arr,n,sum);
        System.out.println(result);
        
        
    }
    public static int search(int[] arr , int N ,int M){
        int result = 0;
 
		// 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만 순회
		for (int i = 0; i < N - 2; i++) {
 
			// 두 번째 카드는 첫 번째 카드 다음부터 N - 1 까지만 순회
			for (int j = i + 1; j < N - 1; j++) {
 
				// 세 번째 카드는 두 번째 카드 다음부터 N 까지 순회
				for (int k = j + 1; k < N; k++) {
					
					// 3개 카드의 합 변수 temp
					int temp = arr[i] + arr[j] + arr[k];
					
					// M과 세 카드의 합이 같다면 temp return 및 종료 
					if (M == temp) {	
						return temp;
					}
					
					// 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 갱신 
					if(result < temp && temp < M) {
						result = temp;
					}
				}
			}
    }
        return result;
    }
}