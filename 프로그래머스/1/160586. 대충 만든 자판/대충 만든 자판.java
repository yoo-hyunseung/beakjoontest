class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i =0 ; i < targets.length ; i++){
            String tar = targets[i];
            // targets 문자열
            for(int j=0 ; j < tar.length();j++){
                char c = tar.charAt(j);
                int min = Integer.MAX_VALUE;
                for(int k = 0 ; k < keymap.length;k++){
                    int index = keymap[k].indexOf(c);
                    if(index == -1)continue;
                    min = Math.min(min, keymap[k].indexOf(c)+1);
                }
                if(min == Integer.MAX_VALUE){
                    answer[i] = -1;
                    break;
                } else{
                    answer[i]+=min;
                }
            }
        }
        return answer;
    }
}