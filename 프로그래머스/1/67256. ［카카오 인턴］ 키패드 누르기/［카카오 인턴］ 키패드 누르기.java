class Solution {
    static String [][] keypad = new String[][] {{"1","2","3"},{"4","5","6"},{"7","8","9"},{"*","0","#"}};
    static String lNow = "*";
    static String rNow = "#";
    public String solution(int[] numbers, String hand) {
        String answer = "";
        for(int i =0 ; i < numbers.length;i++){
            String num = String.valueOf(numbers[i]);
            if("147*".contains(num)){
                answer+="L";
                lNow = num;
            } else if("369#".contains(num)){
                answer+="R";
                rNow = num;
            } else{
                String result = minDistance(num);
                if(result.equals("hand")){
                    if(hand.startsWith("r")){
                        answer+="R";
                        rNow = num;
                    } else{
                        answer+="L";
                        lNow = num;
                    }
                } else{
                    answer+=result;
                }
            }
            
        }
        return answer;
    }
    public static String minDistance(String num){
        int []rPos = new int[2];
        int []lPos = new int[2];
        int []nPos = new int[2];
        for(int i =0 ; i< keypad.length;i++){
            for(int j = 0 ; j < keypad[i].length;j++){
                if(keypad[i][j].equals(lNow)){
                    lPos[0] = i;
                    lPos[1] = j;
                }
                if(keypad[i][j].equals(rNow)){
                    rPos[0] = i;
                    rPos[1] = j;
                }
                if(keypad[i][j].equals(num)){
                    nPos[0] = i;
                    nPos[1] = j;
                }
            }
        }
        int rDis = (int)(Math.abs(nPos[0]-rPos[0])+Math.abs(nPos[1]-rPos[1]));
        int lDis = (int)(Math.abs(nPos[0]-lPos[0])+Math.abs(nPos[1]-lPos[1]));
        if(rDis==lDis){
            System.out.println(num);
            return "hand";
        }
        else if(rDis<lDis){
            rNow = num;
            return "R";
        } else{
            lNow = num;
            return "L";
        }
    }
}