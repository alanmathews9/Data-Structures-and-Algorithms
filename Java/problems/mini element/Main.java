import java.util.Scanner;

public class Main {
    public static void main(String []args){
        int a[][]=new int[20][20];
        int i,j;
        Scanner input =new Scanner(System.in);
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("Enter the element: ");
                a[i][j]=input.nextInt();
            }
        }
        int min=a[0][0];
        int max=a[0][0];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
                if(min>a[i][j]){
                    min=a[i][j];
                }
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
