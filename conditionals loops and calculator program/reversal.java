import java.util.Scanner;

public class reversal {
    public static void main(String[] args){
       int n,m=0;
       System.out.println("Enter the number: ");
       Scanner input=new Scanner(System.in);
       n=input.nextInt();
       while(n!=0){
           m=m*10+(n%10);
           n=n/10;
       }
       System.out.println(m);
    }
}
