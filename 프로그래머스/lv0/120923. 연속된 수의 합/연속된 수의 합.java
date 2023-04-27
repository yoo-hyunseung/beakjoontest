class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        if(total%num == 0){
            int centerValue = total/num;
            int centerIndex = (int)num/2;
            answer[0] = centerValue - centerIndex;
        }
        else{
            int centerValue = total/num;
            int centerIndex = (int)num/2;
            answer[0] = centerValue - centerIndex+1;
        }
        for(int i =1 ; i < answer.length;i++){
            answer[i] = answer[i-1]+1; 
        }
        return answer;
    }
}