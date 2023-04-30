import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int arr [] = new int[array.length];
        int min = Integer.MAX_VALUE;
        for(int i =0 ; i < array.length;i++){
            arr[i] = array[i];
            array[i]= Math.abs(array[i]-n);
            if(array[i] <min){
                min = array[i];
                answer = i;
            }
        }
        answer = arr[answer];
        return answer;
    }
}