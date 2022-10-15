import java.util.*;
public class Main {
   public static void main(String[] args) {
    LinkedList<Integer>list=new LinkedList<>();
    list.addFirst(1);
    list.addLast(2);
    list.add(3);
    System.out.println(list);
    list.remove(2);
    System.out.println(list);
    System.out.println(list.get(1));
   } 
}
