import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int answer[]=new int[temperatures.length];
        Stack<Integer>s1=new Stack<Integer>();
        Stack<Integer>s2=new Stack<Integer>();
        int index=0;
        int counter;
        for(int i=temperatures.length-1;i>=0;i--){
            s1.push(temperatures[i]);
        }
        for(int i=0;i<temperatures.length;i++){
            counter=0;
            int peek_element=s1.peek();
            while(peek_element<=temperatures[i]){
                s2.push(s1.pop());
                counter++;
            }
            answer[index++]=counter;
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            int x=s1.pop();
        }
        return answer;
    }
}
class Main{
    public static void main(String[] args) {
        Solution s=new Solution();
        int array[]=new int[]{73,74,75,71,69,72,76,73};
        int ans[]=s.dailyTemperatures(array);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}