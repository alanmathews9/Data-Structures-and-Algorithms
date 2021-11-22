import java.util.Scanner;

public class largest {
    public static void main(String[] args){
        int a,b,c;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        if(max<c){
            max=c;
        }
        System.out.println("Maximum: "+max);
        // int max=Math.max(a,b); returns maximum value
        
    }
}
