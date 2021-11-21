import java.util.Scanner;

public class iftstatements {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n>10000){
            n+=1000;
        }
        else if(n<5000){
            n+=2000;
        }
        else{
            n-=1200;
        }
        System.out.println("new salary: "+n);
    }
}
