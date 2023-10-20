class Solution {
    public int solution(int n) {
        int arr[] = new int [n+1];
        int answer = 0;
        arr[0] = 0;
        arr[1] = 1;
        for(int i =2; i < arr.length; i++){
            arr[i] = arr[i-2] + arr[i-1];
            arr[i] = arr[i]%1234567;
        }
        answer = arr[n];
        return answer;
    }
}