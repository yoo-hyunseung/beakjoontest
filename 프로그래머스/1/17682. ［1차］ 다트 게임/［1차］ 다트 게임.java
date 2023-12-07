class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int score=0;
        int [] step = new int [3];
        int index = 0;
        for(int i =0 ; i < dartResult.length();i+=1){
            char c = dartResult.charAt(i);
            if(c>='0' && c <='9'){
                if(c=='1'){
                    if(dartResult.charAt(i+1)=='0'){
                        score=10;
                        i++;
                    }else {
                        score=1;
                    }
                }else{
                    score = c-'1'+1;
                }
                // System.out.println("score = "+score);
            } else{
                int num =0;
                switch (c){
                    case 'S':{
                        num = (int)Math.pow(score,1);
                        if(i < dartResult.length()-1){
                            char c2 = dartResult.charAt(i+1);
                            if(c2=='#'){
                                num*=-1;
                                step[index] = num;
                                i++;
                            } else{
                                step[index] =num;
                            }
                        }
                        else{
                            step[index] = num;
                        }
                        index++;
                        break;
                    }
                    case 'D':{
                        num = (int)Math.pow(score,2);
                        if(i < dartResult.length()-1){
                            char c2 = dartResult.charAt(i+1);
                            if(c2=='#'){
                                num*=-1;
                                step[index] = num;
                                i++;
                            } else{
                                step[index] = num;
                            }
                        }
                        else{
                            step[index] = num;
                        }
                        index++;
                        break;
                    }
                    case 'T':{
                        num = (int)Math.pow(score,3);
                        if(i < dartResult.length()-1){
                            char c2 = dartResult.charAt(i+1);
                            if(c2=='#'){
                                num*=-1;
                                step[index] = num;
                                i++;
                            } else{
                                step[index] = num;
                            }
                        } else{
                            step[index] = num;
                        }
                        index++;
                        break;
                    }
                    case '*':{
                        // System.out.println(index);
                        //index =3; 1 , 2  0
                        step[index-1] = 2*step[index-1];
                        if(index-2>=0){
                            step[index-2] = 2*step[index-2];
                        }
                        break;
                    }
                }
            }
        }
        for(int i : step){
            answer+=i;
        }
        return answer;
    }
}