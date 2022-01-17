import java.util.Scanner;

public class Main{
    static int lsearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        else{
            for(int i=0;i<arr.length;i++){
                int element=arr[i];
                if(target==element){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the size: ");
        n=input.nextInt();

        int a[]=new int[n];
        int i;
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Enter the lelemet to be searched: ");

        int target=input.nextInt();
        Main obj=new Main();
        int res=obj.lsearch(a, target);
        if(res==-1){
            System.out.println("Not found");
        }
       else {System.out.println(res);}
    }
   
    }
