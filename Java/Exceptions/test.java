package Java.Exceptions;
import java.lang.NoClassDefFoundError;


public class test {
    public static void main(String []args){
        int i=5;
    try{ 
        if(i<10){
            throw new Exception("error"); //checked exception

        }
    }catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("okk seri bie");
    }
    }
}
class myException extends Exception{
    public myException(String msg){
        super(msg);
    }
}
