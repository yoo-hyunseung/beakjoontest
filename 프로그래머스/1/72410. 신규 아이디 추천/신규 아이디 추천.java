class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        String new_ids = "";
        //step2
        for(int i =0 ; i < new_id.length();i++){
            char c = new_id.charAt(i);
            if((c >='0' && c<='9') || (c>='a' && c <='z') || c=='-' || c=='_' || c=='.'){
                new_ids+=c;
            }
        }
        System.out.println("new_id :"+new_id);
        new_id = new_ids;
        System.out.println("newId : "+new_ids);
        // step3
        while(new_id.contains(".."))
            new_id = new_id.replace("..",".");
        System.out.println("step3");
        System.out.println("new_id :"+new_id);
        // step4
        if(new_id.startsWith(".")){
            new_id=new_id.substring(1);
        }
        if(new_id.endsWith(".")){
            new_id=new_id.substring(0,new_id.length()-1);
        }
        System.out.println("step4");
        System.out.println("new_id :"+new_id);
        // step5
        if(new_id.equals("")){
            new_id+="a";
        }
        System.out.println("step5");
        System.out.println("new_id :"+new_id);
        // step6
        if(new_id.length()>=16){
            new_id = new_id.substring(0,15);
            if(new_id.endsWith(".")){
                new_id=new_id.substring(0,new_id.length()-1);
            }
        }
        System.out.println("step6");
        System.out.println("new_id :"+new_id);
        //step7
        if(new_id.length()<=2){
            while(new_id.length()<3)
            {new_id +=new_id.charAt(new_id.length()-1);}
        }
        System.out.println("step7");
        System.out.println("new_id :"+new_id);
        answer = new_id;
        System.out.println(answer);
        return answer;
    }
}