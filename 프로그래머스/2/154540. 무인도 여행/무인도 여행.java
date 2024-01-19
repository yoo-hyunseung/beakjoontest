import java.util.*;
class Solution {
    static int []dx = {1,0,-1,0};
    static int []dy = {0,1,0,-1};
    static int days;
    static boolean [][] check;
    static int height,width;
    static String [][]map;
    public int[] solution(String[] maps) {
        int[] answer = {};
        height = maps.length;
        width = maps[0].length();
        check = new boolean [height][width];
        map = new String[height][width];
        int count = 0;
        // 방문 여부 체크배열 초기화
        for(int i = 0 ; i < height ; i++){
            for(int j =0 ; j < width ; j++){
                if(maps[i].charAt(j)=='X'){
                    check[i][j] = false;
                    map[i][j] = "X";
                } else{
                    check[i][j] = true;
                    map[i][j] = maps[i].substring(j,j+1);
                }
            }
        }
        // 탐색
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < height ; i++){
            for(int j =0 ; j < width ; j++){
                if(check[i][j]==true){
                    DFS(i,j);
                    list.add(days);
                    count++;
                    days=0;
                }
            }
        }
        if(count==0){
            return answer = new int[]{-1};
        }else{
            Collections.sort(list);
            answer = new int[list.size()];
            for(int i =0 ; i < list.size();i++){
                answer[i] = list.get(i);
            }
        }
        // System.out.println(count);
        return answer;
    }
    public static void DFS(int x,int y){
        check[x][y] = false;
        days += Integer.parseInt(map[x][y]);
        for(int i =0 ; i < 4 ; i++){
            int px = x+dx[i];
            int py = y+dy[i];
            if(px>=0 && px < height && py>=0 && py<width){
                if(check[px][py]==true){
                    DFS(px,py);
                }
            }
        }
    }
}