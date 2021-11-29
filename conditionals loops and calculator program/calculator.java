import java.util.Scanner;

public class calculator {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the operator: ");
        while(true){
            char op=input.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.println("Enter two numbers: ");
               int num1=input.nextInt();
               int num2=input.nextInt();
               int ans;
               if(op=='+'){
                   ans=num1+num2;
                   System.out.println(ans);
               }
               else if(op=='*'){
                   ans=num1*num2;
                   System.out.println(ans);
               }
               else if(op=='/'){
                   ans=num1/num2;
                   System.out.println(ans);
               }
               else if(op=='-'){
                   ans=num1-num2;
                   System.out.println(ans);
               }
            }
            else if(op=='x'||op=='X'){
                break;
            }
            else{
                System.out.println("Invalid operation...");
            }
        }
    }
}
