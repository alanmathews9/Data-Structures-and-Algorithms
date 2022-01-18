public class Main{
    public static void main(String[]args){
        String name="Achyuth";
        char target='u';
        System.out.println(search(name, target));

    }
    static int search(String a,char target){
        if(a.length()==0){
            return -1;
        }
        else{
            for(int i=0;i<a.length();i++){
                if(target==a.charAt(i)){
                    return i;
                }
            }
        }
        return -1;
    }
   

}