import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<double[]> rank = new ArrayList<>();
        int [] user = new int[N+2];
        for(int i =0 ; i < stages.length;i++){
            user[stages[i]]++;
        }
        for(int i =1 ; i <=N;i++){
            int now = user[i];
            int sum = 0;
            if(now==0){
                rank.add(new double[]{i,0});
            }
            else{
                for(int j =i ; j <=N+1;j++){
                    sum += user[j];    
                }
                double fail = ((double)now/(double)sum);
                rank.add(new double[]{i,fail});
            }
            
        }
        rank.sort((e1,e2)->{
            if(e1[1]==e2[1]){
                return Double.compare(e1[0],e2[0]);
            }
            return Double.compare(e2[1],e1[1]);
        });
        for(int i =0 ; i < N ; i++){
            answer[i] = (int)rank.get(i)[0];
        }
        return answer;
        
    }
}