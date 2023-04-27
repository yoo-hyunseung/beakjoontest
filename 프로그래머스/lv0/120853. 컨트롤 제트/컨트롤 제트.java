import java.util.StringTokenizer;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int n =0;
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(!str.equals("Z")){
                n = Integer.parseInt(str);
                answer +=n;
            }
            else{
                answer-=n;
            }
        }
        return answer;
    }
}