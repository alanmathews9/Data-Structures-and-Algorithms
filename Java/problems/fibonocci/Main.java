import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter the limit: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(i=2;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }

    }
}