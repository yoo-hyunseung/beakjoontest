import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        // System.out.print(answer);
        for(int i=0; i<commands.length;i++){
            int [] arr = new int[commands[i][1]-commands[i][0]+1];
            arr = Arrays.copyOfRange(array,commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);
            answer[i]=arr[commands[i][2]-1];
        }
        
        return answer;
    }
}