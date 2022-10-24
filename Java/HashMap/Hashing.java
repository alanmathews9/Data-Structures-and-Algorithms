import java.util.*;
public class Hashing{
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"Achyuth");
        map.put(3,"Adithya");
        map.put(2,"Abhi");
        map.put(4,"Sanosh");
        System.out.println("Displaying: ");
        // for(Map.Entry<Integer,String>e:map.entrySet()){
        //     System.out.print("Key: "+e.getKey()+" Value: "+e.getValue());
        //     System.out.println("");
        // }
        map.remove(4);
        // for(Map.Entry<Integer,String>e:map.entrySet()){
        //     System.out.print("Key: "+e.getKey()+" Value: "+e.getValue());
        //     System.out.println("");
        // }
        map.put(3,"Athul");
        for(Map.Entry<Integer,String>e:map.entrySet()){
            System.out.print("Key: "+e.getKey()+" Value: "+e.getValue());
            System.out.println("");
        }
        System.out.println("First: ");
        System.out.println(map.get(1));
        System.out.println("Array: ");
        int nums[]={1,2,1,2,1,3,6,5,9,8,7};
        Collections.sort(nums);
    }
}