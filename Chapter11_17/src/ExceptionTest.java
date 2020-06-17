import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        try
        {
            getExceptionA();
        }
        catch(ExceptionA ea)
        {
            ea.printStackTrace();
        }
        try{
            getExceptionB();
        }catch(ExceptionA ea){
            ea.printStackTrace();
        }

        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException");
            e.printStackTrace();
        }
        try {
            throw new IOException();
        } catch(IOException ioe) {
            System.out.println("IOException");
            ioe.printStackTrace();
        }
    }

    public static void getExceptionA() throws ExceptionA
    {
        throw new ExceptionA("Exception A");
    }
    public static void  getExceptionB() throws ExceptionB{
        throw new ExceptionB("Exception B");
    }
}
