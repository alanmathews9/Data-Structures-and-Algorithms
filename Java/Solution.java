import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int n,ctr;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        ctr=input.nextInt();
        int a[]=new int [n];
        int i;
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        for(int j=0;j<ctr;j++){
            int temp=a[0];
            for(i=0;i<n-1;i++){
                a[i]=a[i+1];
            }
            a[n-1]=temp;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}