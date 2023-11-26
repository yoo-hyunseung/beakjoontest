class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        for(int i =0  ; i < myString.length();i+=1){
            char c = myString.charAt(i);
            if(c=='A'){
                str += "B";
            } else{
                str +="A";
            }
            
        }
        if(str.contains(pat)){
            answer=1;
        }
        return answer;
    }
}