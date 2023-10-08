class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[s.length()];
        int arr[] = new int[26];
        for(int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);
            if(i==s.indexOf(c)){
                answer[i]=-1;
                arr[c-'a'] = s.indexOf(c);
            } else {
                answer[i] = Math.abs((arr[c-'a'] - i));
                arr[c-'a'] = i;
            }
        }
        return answer;
    }
}