import java.util.Scanner;

public class celciustofaren {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        float c;
        float f;
        System.out.println("Enter the temperature in celcius: ");
        c=input.nextFloat();
        f=(c*9/5)+32;
        System.out.println("Farenheit: "+f);
        
    }
}
