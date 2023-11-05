class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int [] max = new int[sizes.length];
        int [] min = new int[sizes.length];
        for (int i =0 ; i < sizes.length;i++){
            if(sizes[i][0]>sizes[i][1])
            { 
                max[i]=sizes[i][0];
                min[i]=sizes[i][1];
            }
            else
            {
                max[i]=sizes[i][1];
                min[i]=sizes[i][0];
            }
        }
        answer = mAx(max, max.length) * mAx(min,min.length);
        return answer;
    }
    
    static int mAx(int[] a,int num){
        int max = a[0];
        for (int i =1; i<num; i++){
            if (a[i]>max)
                max=a[i];
        }
        return max;
    }
         
}