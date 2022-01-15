import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException{
    public static void main(String args[]){
        int i,j=1,k=0;
        int a[]=new int[3];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        i=8;
        
        try{
           
            j=Integer.parseInt(br.readLine());
            k=i+j;
            if(k<10){
                throw new ArithmeticException();
            }
            System.out.println("Output:"+ k);
            
        }
        catch(IOException e){
            System.out.println("Some IO Errror");
        }
        catch(ArithmeticException e){
            System.out.println("Minimum value for the output is 10"); //ArithmeticException is sub class of class Exception
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of order");
        }
        catch(Exception e){
            System.out.println("Unknown exception");
            
        }//always write main exception as last exception or else it will be  caught by exceptions for which we had defined the class.

       finally{
        
        System.out.println(("Finally: Bye"));
       }//must be printed or executed anyway
        
    }
}