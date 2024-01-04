class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean visit[] = new boolean[10];
        for(int i =0 ; i < numbers.length; i ++){
            visit[numbers[i]] = true;
        }
        for(int i=0 ; i < visit.length;i++){
            if(!visit[i])
                answer+=i;
        }
        return answer;
    }
}