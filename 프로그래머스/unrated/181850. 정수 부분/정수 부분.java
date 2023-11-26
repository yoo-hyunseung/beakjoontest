class Solution {
    public int solution(double flo) {
        int answer = 0;
        String s = String.valueOf(flo);
        s = s.substring(0,s.indexOf("."));
        answer = Integer.parseInt(s);
        return answer;
    }
}