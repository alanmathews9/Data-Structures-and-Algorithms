
import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) {
        LinkedList <String> list=new LinkedList();
        list.addLast("Hello");
        list.add("World");
        list.addFirst("First");
        System.out.println(list);
        int n=list.size();
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+"---->");
        }
        System.out.print("null");
        list.removeFirst();
        list.removeLast();
        list.remove(0);
        System.out.println(list);
    }
}