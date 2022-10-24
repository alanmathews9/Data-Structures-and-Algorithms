import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Before: ");

        System.out.println(list);
        // list.clear();
        ArrayList<Integer> targets=new ArrayList<>();
        targets.add(1);
        targets.add(2);
        targets.add(3);
        list.removeAll(targets);
        System.out.println(list);
        list.addAll(targets);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
