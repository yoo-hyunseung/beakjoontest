class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int loop =0;
        int count =0;
        while(!s.equals("1")){
            String s1 = "";
            for(int i =0 ; i < s.length();i++){
                if(s.charAt(i)== '1') {
                    s1 += s.charAt(i) + "";
                    // System.out.println(count);
                }
                else count++;
            }
            int c = s1.length();
            s1 = Integer.toBinaryString(c);
            s = s1;
            loop++;
        }
        answer[0] = loop;
        answer[1] = count;
        return answer;
    }
}