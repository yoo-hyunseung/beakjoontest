class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int index = 0;

        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < number.length()-k;i++){ // 자릿수 
            int max =0;
            for(int j = index; j <= i+k ; j++){ // 탐색
                if(max < number.charAt(j)){
                    max = number.charAt(j);
                    index = j+1;
                }
            }
            sb.append((char)(max));
        }
        answer = sb.toString();
        return answer;
    }
}