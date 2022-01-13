import java.util.Scanner;

public class AutoFloat {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        // float n=input.nextFloat(); if we simply enter 3 then it will be turned to 3.0
        // System.out.println(n);
        int num=(int)(67.556f); //This is type casting ie it converts float to integer. it simply chages to 67
        // System.out.println(num);
        // automatic type promotion in expressions
        // int a=257;
        // byte b=(byte)(a); //257%256=1 takes place and returns 1
        // System.out.println(b);
        byte a=40;
        byte b=50;
        byte c=100;
        int d=(a*b)/c;
        System.out.println(d);
        // b=b*2; this will result in error since RHS is integer and it cant be converted to byte
        int n='A';//ASCII value
        System.out.println(n); //returns 65 which is ASCII value
        System.out.println(3*5.66f);
        byte k=42;
        char l='q';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double m=0.1234;
        double result=(f*k)+(i/l)-(m-s); //i/l=integer. 
        System.out.println(result); // 1704.0166146484376 Answer
        
    }
}
