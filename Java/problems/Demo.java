class Solution {
    public static void main(String []args){
        System.out.println(romanToInt("VII"));
    }
    public static int romanToInt(String s) {
        int i,j,sum=0;
        for(i=0;i<s.length()-1;i+=2){
            if(value(s.charAt(i))>=value(s.charAt(i+1))){
                if((i+1)>s.length()){
                    sum+=value(s.charAt(i));
                }
                else{
                     sum+=value(s.charAt(i))+value(s.charAt(i+1));
                }
               
            }
            else{
                sum+=value(s.charAt(i+1))-value(s.charAt(i));
            }
            // if(s.length()%2==1){
            //     sum+=s.charAt(s.length()-1);
            // }
        }
        return sum;
         
        }
    public static int value(char x){
        if(x=='I'){
            return 1;
        }
        else if(x=='V'){
            return 5;
        }
        else if(x=='X'){
            return 10;
        }
        else if(x=='L'){
            return 50;
        }
        else if(x=='C'){
            return 100;
        }
        else if(x=='D'){
            return 500;
        }
        else if(x=='M'){
            return 1000;
        }
        
    
        return -1;
        
    }
      
}