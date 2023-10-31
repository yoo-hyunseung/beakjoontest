class Solution {
    static char ch[] = {'A','E','I','O','U'};
    static int count =0;
    static int answer = 0;
    public int solution(String word) {
        
        dfs(word,"");
        return answer;
    }
    public static void dfs(String words, String str){
        if(str.equals(words) || str.length() == 5){
            if(str.equals(words)){
                answer = count;
            }
            return;
        }
        for(int i =0 ; i < 5;i++){
            count++;
            dfs(words,str+ch[i]);
        }
    }
}