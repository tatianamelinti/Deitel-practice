package Chap11_16;

public class ExceptionTest {
    public static void main(String[] args){
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
        try{
            getExceptionC();
        }catch(ExceptionA ea){
            ea.printStackTrace();
        }

    }
    public static void getExceptionA() throws ExceptionA
    {
        throw new ExceptionA("Exception A");
    }
    public static void  getExceptionB() throws ExceptionB{
        throw new ExceptionB("Exception B");
    }

    public static void  getExceptionC() throws ExceptionC{
        throw new ExceptionC("Exception C");
    }
    }
