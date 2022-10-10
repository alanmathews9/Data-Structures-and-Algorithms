import java.util.*;
class Main{
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        Deque<Integer>dqueue=new LinkedList<Integer>();
        
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }

    }
}