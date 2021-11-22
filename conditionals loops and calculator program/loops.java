import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++){                    //for loop
            System.out.println("Hello "+(i+1));
        }

        System.out.println("applying while loop:");
        int i=0;
        while(i<n){                               //while loop
            System.out.println("Hello "+(i+1));
            i++;
        }
        System.out.println("Do while loop");
        i=1;
        do{                                      //do-while loop excetues ones without checking the condition
            System.out.println("hello world");
            
        }while(i!=1); //prints hello 1
    }
}
