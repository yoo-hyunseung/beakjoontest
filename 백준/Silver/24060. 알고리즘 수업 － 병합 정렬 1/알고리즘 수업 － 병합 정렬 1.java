import java.io.*;
import java.util.*;

public class Main{
    static int sorted[];
    static int count = 0;
    static boolean check = false;
    static int k;
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int [] a = new int [n];
        sorted = new int[n];
        st= new StringTokenizer(br.readLine());
        for(int i =0  ; i < n ; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(a,0,a.length-1);
        if(!check ){
            System.out.println(-1);
        } else{
            System.out.println();
        }
    }
    public static void merge_sort(int arr[], int left, int right){
        if(left==right) return;

        int mid = (left+right)/2;

        merge_sort(arr,left,mid);
        merge_sort(arr,mid+1,right);

        merge(arr,left,mid,right);
    }
    public static void merge(int arr[],int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int idx = left;
        while(l<=mid && r<=right){
            if(arr[l] < arr[r]){
                sorted[idx] = arr[l];
                idx++;
                l++;
            }
            if(arr[l] > arr[r]){
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }
        if(l>mid){
            while(r<=right){
                sorted[idx]=arr[r];
                r++;
                idx++;
            }
        }
        else{
            while(l<=mid){
                sorted[idx] = arr[l];
                l++;
                idx++;
            }
        }
        for(int i = left ; i <=right;i++){
            count++;
            if(count==k){
                System.out.println(sorted[i]);
                System.exit(0);
            }
            arr[i] = sorted[i];
        }
    }
}