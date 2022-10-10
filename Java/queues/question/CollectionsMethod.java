// queue using 2 stacks
import java.util.*;
class CollectionStack{
    Stack<Integer>s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();
    void enqueue(int x){
        if(s1.isEmpty()){
            s1.push(x);
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
    }
    void dequeue(){
        if(s1.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("removed: "+s1.peek());
            s1.pop();
        }
    }
    void front_element(){
        if(s1.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println(s1.peek());
        }
    }
}
public class CollectionsMethod {
    public static void main(String[] args) {
        CollectionStack cs=new CollectionStack();
        cs.enqueue(0);
        cs.enqueue(1);
        cs.enqueue(3);
        cs.front_element();
        cs.dequeue();
        cs.front_element();
    }
}
