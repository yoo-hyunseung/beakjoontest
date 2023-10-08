class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0 ;i < n ; i++){
            answer[i] = String.valueOf(Integer.toBinaryString(arr1[i]|arr2[i]));
            String s = answer[i].replace("0"," ");
            s = s.replace("1","#");
            while(s.length()<n){
                s = " "+s;
            }
            answer[i]=s;
        }
        return answer;
    }
}