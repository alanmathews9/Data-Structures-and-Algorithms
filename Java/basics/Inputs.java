import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Inputs {
    public static void main(String[] args){
        System.out.println("Please enter you name: ");
        Scanner input =new Scanner(System.in); //in this we take input from user and stre it in variable 'input'
        String name=input.nextLine();//in this we assign variable rollno with the vaue of input in terms of integer.
        System.out.println("Enter Your rollno: ");
        
        int rno=input.nextInt();

        System.out.println("Your Rollno is: "+ rno);
        System.out.println("Your name: "+name);
    }
}
