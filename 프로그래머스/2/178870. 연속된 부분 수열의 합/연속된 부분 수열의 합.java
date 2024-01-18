class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        int ans1=0,ans2=0;
        int start=0,end=0;
        int sum = 0;
        int minleng = Integer.MAX_VALUE;
        for(end =0 ; end < sequence.length; end++){
            sum += sequence[end];
            // 클때  end는 계속증가 
            while(sum>k){
                sum-=sequence[start];
                start++;
            }
            if(sum==k){
                if(minleng > end-start){
                    minleng = end-start;
                    ans1=start;
                    ans2=end;
                }
            }
            
        }
        return answer = new int[]{ans1,ans2};
    }
}