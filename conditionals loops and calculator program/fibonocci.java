//find the nth fibonacci number

import java.util.Scanner;

public class fibonocci {
   public static void main(String[] args) {
       int a=0,b=1;
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int count=2;
       while(count<=n){
           int temp=b;
           b+=a;
           a=temp;
           count++;
            }
            System.out.println(b);
       
   }
}
// 41:08
