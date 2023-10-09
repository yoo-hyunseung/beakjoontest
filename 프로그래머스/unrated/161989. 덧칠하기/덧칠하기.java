class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean [] wall = new boolean[n+1];
        for(int i =0 ; i < section.length;i++){
            wall[section[i]] =true; 
            // 비어있으면 true
        }
        // wall.length => n+1
        for(int i = 1; i < wall.length-m;i++){
            if(wall[i]){
                for(int j = i ; j < i+m ; j++){
                    wall[j] = false;
                }
                answer++;
            }
        }
        for(int i = wall.length-m ; i < wall.length;i++){
            if(wall[i]){
                answer++;
                break;
            }
        }
        
        return answer;
    }
}