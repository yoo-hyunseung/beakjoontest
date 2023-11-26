class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int pow = 0;
        for(int i =0 ; i < num_list.length; i++){
            mul *= num_list[i];
            pow += num_list[i];
        }
        pow = (int)Math.pow(pow,2);
        if(mul < pow){
            answer = 1;
        }
        return answer;
    }
}