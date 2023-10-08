class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i =1 ; i < food.length;i++){
            int num = (int)(food[i]/2);
            for(int j=0 ; j < num;j++){
                answer+=(i);
            }
        }
        answer +="0";
        StringBuilder sb = new StringBuilder(answer);
        answer += sb.reverse();
        answer = answer.replace("00","0");
        
        return answer;
    }
}