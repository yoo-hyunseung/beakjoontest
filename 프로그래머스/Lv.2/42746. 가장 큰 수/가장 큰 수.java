import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        for(int i =0 ; i< numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str,(o1,o2)-> (o2+o1).compareTo(o1+o2));// 내림차순 정렬  두숫자를 붙여서 큰수 대로 정렬 
        if(str[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < str.length; i++){
            sb.append(str[i]);
        }
        answer = sb.toString();
        return answer;
    }
}