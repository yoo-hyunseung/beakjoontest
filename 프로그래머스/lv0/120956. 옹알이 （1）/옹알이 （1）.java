import java.util.Arrays;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String s [] = {"aya", "ye", "woo", "ma"};
        for(int i =0  ; i <s.length ; i++){
            for(int j =0 ; j < babbling.length; j++){
                if(babbling[j].contains(s[i])){
                    babbling[j]=babbling[j].replace(s[i],"1");
                }
                if(babbling[j].equals("1")){
                    babbling[j]=babbling[j].replace("1","");
                }else if(babbling[j].equals("11")){
                    babbling[j]=babbling[j].replace("11","");
                }else if(babbling[j].equals("111")){
                    babbling[j]=babbling[j].replace("111","");
                }else if(babbling[j].equals("1111")){
                    babbling[j]=babbling[j].replace("1111","");
                }
                
                
            }
            
        }
        System.out.println(Arrays.toString(babbling));
        for(int i =0  ;i < babbling.length;i++){
            if(babbling[i].equals(""))answer++;
        }
        
        return answer;
    }
}