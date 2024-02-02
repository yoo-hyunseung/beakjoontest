import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        int answer = 0;
        int total = 0;
        for(int i : number){
            total+=i;
        }
        for(int i = 0 ; i <=discount.length-total;i++){
            HashMap<String, Integer> map = new HashMap<>();
            for(int k =0  ; k< want.length;k++){
                map.put(want[k],number[k]);
            }
            // System.out.println(map.keySet());
            for(int j = i ; j < total+i; j++){
                String item = discount[j];
                if(map.containsKey(item)){
                    if(map.get(item)>0){
                        map.put(item, map.get(item)-1);
                        // System.out.println(item);
                        // System.out.println(item+" "+map.entrySet());
                    }
                }
            }
            int sum = 0;
            List<Integer> list = new ArrayList<>(map.values());
            for(int j : list){
                sum+=j;
            }
            if(sum == 0){
                answer++;
            }
        }
        return answer;
    }
}