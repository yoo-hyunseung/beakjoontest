class Solution {
    public int solution(int price) {
        int answer = price;
        if(answer >=100000 && answer<300000){
            answer = (int)(answer*0.95);
        }
        else if(answer >=300000 && answer<500000){
            answer = (int)(answer*0.9);
        }
        else if(answer>=500000){
            answer = (int)(answer*0.8);
        }
        return answer;
    }
}