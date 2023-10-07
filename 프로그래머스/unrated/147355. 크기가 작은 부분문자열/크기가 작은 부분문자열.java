class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length()-p.length()+1;
        for(int i = 0 ; i<length;i++){
            long num = Long.parseLong(t.substring(i,i+p.length()));
            long num2 = Long.parseLong(p);
            if(num<=num2){
                answer++;
            }
        }
        return answer;
    }
}