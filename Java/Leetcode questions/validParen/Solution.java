import java.io.CharArrayReader;
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        String popContainer=new String();
        Stack<String>stack=new Stack<>();
        String popped;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String ch=Character.toString(c);
            if(stack.size()==0){
                if(ch=="("||ch=="["||ch=="{"){
                    stack.push(ch);
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(stack.size()!=0){
                String peekelement=stack.peek();
                System.out.println(peekelement);
                if(ch=="("||ch=="["||ch=="{"){
                    stack.push(ch);
                }
                else if(ch==")"){
                    if(peekelement=="("){
                        popped=stack.pop();
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else if(ch=="]"){
                    if(peekelement=="["){
                        popped=stack.pop();
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(peekelement=="{"){
                        popped=stack.pop();
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
       if(stack.size()==0){
        return true;
       }
       return false;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        if(s.isValid("(())")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}