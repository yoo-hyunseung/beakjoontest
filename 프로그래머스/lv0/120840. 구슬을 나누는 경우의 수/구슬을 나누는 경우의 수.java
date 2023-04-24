class Solution {
    public long solution(int balls, int share) {
        long answer = combination(balls, share);
        System.out.println(answer);
        return answer;
        
    }
    public static long combination(int n, int r) {
		if(n == r || r == 0) 
			return 1l; 
		else 
			return combination(n - 1, r - 1) + combination(n - 1, r); 
	}
    
}