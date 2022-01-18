import java.util.Scanner;

import javax.naming.NamingException;

public class Main {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n,m,i,j;
        int a[][]=new int[20][20];
        System.out.println("Enter the number of rows and columns: ");
        n=input.nextInt();
        m=input.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println("Enter the element");
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the element to be searched: ");
        int target=input.nextInt();
        Main obj =new Main();
      
        int res[]=new int[2];
        res[]=obj.search(a, target,n,m);
        System.out.println("Element found at:");
        System.out.println(res[0],res[1]);
    }
    static int[] search(int a[][],int target,int n,int m){
        int i,j;
        int res[]=new int[2];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[i][j]==target){
                   return new int[]{i,j};
                }
            }
        }
        res[0]=-1;
        res[1]=-1;
        return res;
    }
}
