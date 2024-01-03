import java.util.*;
class Solution {
    static int []dx = {1,0,-1,0}; // E오른쪽 N아래 W왼쪽 S 위
    static int []dy = {0,1,0,-1};
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        StringTokenizer st;
        int height = park.length; // 높이
        int width = park[0].length(); // 너비
        int startX = 0; // 가로
        int startY = 0; // 세로
        String map[][] = new String[height][width];
        for(int i = 0 ; i < height;i++){
            String str = park[i];
            for(int j =0 ; j < width;j++){
                map[i][j] = str.substring(j,j+1); // 자르기
                if(map[i][j].equals("S")){
                    // 초기 시작위치 설정
                    startX = j;
                    startY = i;
                }
                // System.out.print(map[i][j]);
            }
            // System.out.println();
        }
        for(int i = 0 ; i< routes.length;i++){
            st = new StringTokenizer(routes[i]," ");
            String way = st.nextToken(); // 방향
            int length = Integer.parseInt(st.nextToken()); // 칸수
            int index=0; // 방향 인덱스
            switch(way){
                case "E":
                    index = 0;
                    break;
                case "N":
                    index = 3;
                    break;
                case "W":
                    index = 2;
                    break;
                case "S":
                    index = 1;
                    break;
            }
            int nextX = startX;
            int nextY = startY;
            boolean isX = false;
            // System.out.println(way+" "+index+" "+length);
            for(int j =0 ; j< length;j++){
                nextX += dx[index];
                nextY += dy[index];
                if((nextX<width && nextX >=0 && nextY < height && nextY>=0)){
                    if(map[nextY][nextX].equals("X")){
                        isX=true;
                        break;
                    }
                } else{
                    isX = true;
                    break;
                }
            }
            if(!isX){
                // System.out.println("move : "+nextY+" "+nextX);
                startX = nextX;
                startY = nextY;
            }
        }
        // System.out.println(startY + " "+startX);
        answer = new int [] {startY,startX};
        return answer;
    }
}