import java.util.Scanner;

public class findinno {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("Enter the digit to be counted: ");
        int k=input.nextInt();
        int ctr=0;
        while(n!=0){
            if(k==n%10){
                ctr++;
            }
            n=n/10;
        }
        System.out.println("The count of "+k+" is "+ ctr);
    }
}
