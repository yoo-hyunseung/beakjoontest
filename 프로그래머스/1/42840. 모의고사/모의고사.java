class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int p1[] = { 1, 2, 3, 4, 5};
        int p2[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int p3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score [] = new int[3];
        for(int i = 0 ; i< answers.length ; i++){
            if(answers[i] == p1[i%p1.length])score[0]++;
            if(answers[i] == p2[i%p2.length])score[1]++;
            if(answers[i] == p3[i%p3.length])score[2]++;
        }
        int max =0;
        int per = -1;
        for(int i =0 ; i < 3; i++){
            if(max <score[i]){
                max = score[i];
                per = i+1;
            }
        }
        int count =0;
        for(int i =0 ; i < 3 ; i++){
            if(max == score[i])count++;
        }
        answer = new int[count];
        int index =0;
        for(int i =0 ; i< score.length; i++){
            if(max == score[i]){
                answer[index++] = i+1;
            }
        }
        return answer;
    }
}