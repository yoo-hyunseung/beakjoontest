class Solution {
    public int[] solution(String[] wallpaper) {
        
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int ldx = Integer.MIN_VALUE;
        int ldy = Integer.MIN_VALUE;
        int weight = wallpaper[0].length();
        int height = wallpaper.length;
        char back [][] = new char[height][weight];
        for(int i = 0; i < back.length; i ++){
            String str = wallpaper[i];
            for(int j = 0 ; j < back[i].length; j++){
                back[i][j] = str.charAt(j);
                if(back[i][j] == '#'){
                    if(i <= lux)lux = i;
                    if(j <= luy)luy = j;
                    if(i >= ldx)ldx = i+1;
                    if(j >= ldy)ldy = j+1;
                }
            }
        }
        int answer[] = {lux, luy, ldx, ldy};
        return answer;
    }
}