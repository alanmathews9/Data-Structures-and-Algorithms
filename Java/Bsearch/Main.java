import java.util.Scanner;

public class Main {
    //ASCENDING ORDER.
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the array size: ");
        int n=input.nextInt();
        int []a=new int[n];
        int i;
        for(i=0;i<n;i++){
            System.out.println("Enter the number: ");
            a[i]=input.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int target=input.nextInt();

        int res=Bsearch(a, target);
        if(res==-1){
            System.out.println("Not found!!");
        }
        else{
            System.out.println(res);
        }
    }
    static int Bsearch(int []a, int target){
        int start=0;
        int end=a.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2; ///for millions of data int crosses its limit;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
   
}
