import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        for(int i =0 ; i< participant.length;i++){
            if(map.containsKey(participant[i])){
                map.put(participant[i],map.get(participant[i])+1);
            } else{
                map.put(participant[i],1);
            }
        }
        for(int i =0 ; i < completion.length;i++){
            if(map.containsKey(completion[i])){
                map.put(completion[i],map.get(completion[i])-1);
            }
        }
        for(String s : map.keySet()){
            if(map.get(s)!=0){
                answer+=s;
            }
        }
        
        return answer;
    }
}