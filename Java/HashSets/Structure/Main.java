import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
        Iterator it=set.iterator();
        System.out.println("Size: "+set.size());
        System.out.println(set);
        System.out.println(set.contains(1));
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
